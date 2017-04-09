import java.io.*;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Monkey.TNT on 11/23/2016.
 */
public class Student {
    private String EnrolID;
    private String FirstName;
    private String LastName;
    private int Age;

    public String getEnrolID() {
        return EnrolID;
    }

    public void setEnrolID(String enrolID) {
        EnrolID = enrolID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Student() {
        this("", "", "", 0);
    }

    public Student(String enrolID, String firstName, String lastName, int age) {
        this.EnrolID = enrolID;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Age = age;
    }

    public static Vector<Student> studentVector = new Vector<>();

    public void addbefore() {
        Student student = new Student("GC00123", "Huy ", "Nguyễn Xuân ", 19);
        Student student1 = new Student("GC00125", "Thảo", "Hoàng Thu ", 18);
        studentVector.add(student);
        studentVector.add(student1);
    }

    public void Add() {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Add a new Student!");
        System.out.println("EnrolID: ");
        student.setEnrolID(sc.nextLine());
        System.out.println("FirstName: ");
        student.setFirstName(sc.nextLine());
        System.out.println("LastName: ");
        student.setLastName(sc.nextLine());
        System.out.println("Age: ");
        student.setAge(sc.nextInt());
        studentVector.add(student);
    }

    public void Save() throws FileNotFoundException {
        FileOutputStream fops = new FileOutputStream("student.dat");
        PrintWriter pw = new PrintWriter(fops);
        for (Student s : studentVector) {
            pw.printf("%-20s %-13s %-17s %-15d", s.EnrolID, s.LastName, s.FirstName, s.Age);
            pw.println();
        }
        pw.close();

    }

    public void Display() throws FileNotFoundException {
        try {
            FileReader fr = new FileReader("student.dat");
            BufferedReader input = new BufferedReader(fr);
            System.out.printf("%-20s %-30s %-15s", "EnrolID", "Full Name", "Age");
            System.out.println();
            input.lines().forEach(x->{
                System.out.println(x);
            });
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
