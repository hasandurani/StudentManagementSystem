import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args){
        System.out.println("STUDENT MANAGEMENT SYSTEM");
        System.out.println("...What You Want , PLEASE SELECT FROM BELOW...");
        while (true)
        {
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student");
        System.out.println("3. View All Students");
        System.out.println("4. Search Student");
        System.out.println("5. Exit");

        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        if (user==1){
            System.out.println("Add Student Details Here Please: ");
            sc.nextLine();
            System.out.println("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Enter Roll No: ");
            int rollno = sc.nextInt();
            Student s = new Student(name,rollno);
            students.add(s);
            System.out.println("...Student Added Successfully...");
        } else if (user==2) {
            System.out.println("Enter Student Roll No Which you want to remove");
            sc.nextLine();
                    int rollremove = sc.nextInt();
                    boolean found= false;
                    for (int i=0; i<students.size(); i++){
                        Student s = students.get(i);
                        if (s.rollno==rollremove){
                            students.remove(i);
                            found = true;
                            System.out.println("Student Found and Removed Successfully");
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("..No Student Here of This Roll No...");
                    }
        } else if (user==3) {
            if (students.isEmpty()){
                System.out.println("...There is NO STUDENT , Please ADD STUDENT First...");
            }
            else {
                System.out.println("...List of Students are...");
                for (int i=0; i<students.size(); i++){
                    Student s = students.get(i);
                    System.out.println("Name :"+s.name + "\nRoll No :"+s.rollno);
                }
            }
        } else if (user==4) {
            System.out.println("Which Student You want to Search");
            sc.nextLine();
            System.out.print("Enter Roll No: ");
           int searchroll = sc.nextInt();
            boolean found = false;
            for (int i=0; i<students.size(); i++){
                Student s = students.get(i);
                if (searchroll==s.rollno){
                    System.out.println(s.name+" "+s.rollno);
                    found = true;
                    break;
                }
            }
             if (!found) {
                System.out.println("...Student Not Found...");
            }
        } else if (user==5) {
            System.out.println("Exiting Bye");
        break;

        } else System.out.println("WRONG INPUT PLEASE SELECT FROM 1-5");
    }
}}
class Student{
    String name;
    int  rollno;
    public Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
}
