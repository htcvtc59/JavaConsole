package fpt.edu.vn;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Monkey.TNT on 11/10/2016.
 */

public class Student {
    private int RollNumber;
    private String Name;
    private int Age;
    private float Mark;

    public int getRollNumber() {
        return RollNumber;
    }

    public void setRollNumber(int rollNumber) {
        RollNumber = rollNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public float getMark() {
        return Mark;
    }

    public void setMark(float mark) {
        Mark = mark;
    }

    public Student() {
        this(0, "", 0, 0);
    }

    public Student(int rollNumber, String name, int age, float mark) {
        this.RollNumber = rollNumber;
        this.Name = name;
        this.Age = age;
        this.Mark = mark;
    }


    public static Vector<Student> studentVector = new Vector<>();

    public void addbefore() {
        Student student = new Student(1, "Minh", 23, 10);
        Student student1 = new Student(2, "Anh", 20, 9);
        Student student2 = new Student(3, "Vu", 19, 8);
        Student student3 = new Student(5, "Ngoc", 18, 6);
        studentVector.add(student);
        studentVector.add(student1);
        studentVector.add(student2);
        studentVector.add(student3);
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Add new Student!");
        System.out.println("RollNumber: ");
        student.setRollNumber(sc.nextInt());
        sc.nextLine();
        System.out.println("Name: ");
        student.setName(sc.nextLine());
        System.out.println("Age: ");
        student.setAge(sc.nextInt());
        System.out.println("Mark: ");
        student.setMark(sc.nextFloat());
        studentVector.add(student);


    }

    public void displayAllStudent() {
        Student student = new Student();
        student.sortName(studentVector);
        System.out.println("DISPLAY ALL STUDENT !");
        System.out.printf("%-20s %-15s %-15s %-15s", "RollNumber", "Name", "Age", "Mark");
        System.out.println();
        for (int i = 0; i < studentVector.size(); i++) {
            System.out.printf("%-20d %-15s %-15d %-15.2f", studentVector.get(i).getRollNumber(), studentVector.get(i).getName()
                    , studentVector.get(i).getAge(), studentVector.get(i).getMark());
            System.out.println();
        }
    }

    private void sortName(Vector<Student> studentVector) {
        Collections.sort(studentVector, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.getName().compareTo(o2.getName()));
            }
        });

    }

    public void updates() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Update a Student !");
        System.out.println("Enter a RollNumber: ");
        int roll = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        for (Student s : studentVector) {
            if (s.getRollNumber() == roll && !found) {
                updateStudent(s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No student with RollNumber!");
        }

    }

    public void updateStudent(Student s) {
        boolean edit = true;
        Scanner sc = new Scanner(System.in);
        while (edit) {
            System.out.println(String.format("Please choice!\n1. Change RollNumber\n2. Change Name\n3. Change Age\n4. Change Mark\n5. Done"));
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("New RollNumber: ");
                    int newRollNumber = sc.nextInt();
                    s.setRollNumber(newRollNumber);
                    break;
                case 2:
                    System.out.println("New Name: ");
                    String newName = sc.nextLine();
                    s.setName(newName);
                    break;
                case 3:
                    System.out.println("New Age: ");
                    int newAge = sc.nextInt();
                    s.setAge(newAge);
                    break;
                case 4:
                    System.out.println("New Mark: ");
                    float newMark = sc.nextFloat();
                    s.setMark(newMark);
                    break;
                case 5:
                    edit = false;
                    break;
                default:
                    break;
            }
        }
    }


    public void deleteStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a RollNumber: ");
        int delete = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < studentVector.size(); i++) {
            if (studentVector.get(i).getRollNumber() == delete) {
                System.out.println("You want to remove,choice yes or no: ");
                String yes = sc.nextLine();
                if (yes.equalsIgnoreCase("yes")) {
                    studentVector.remove(i);
                }

            }
        }

    }

    public void searchStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Search Students! ");
        System.out.println(String.format("1. Search RollNumber\n2. Search Name"));
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter a RollNumber: ");
                int roll = sc.nextInt();
                sc.nextLine();
                System.out.printf("%-20s %-15s %-15s %-15s", "RollNumber", "Name", "Age", "Mark");
                System.out.println();
                for (Student s : studentVector) {
                    if (s.getRollNumber() == roll) {
                        System.out.printf("%-20d %-15s %-15d %-15.2f", s.RollNumber, s.Name, s.Age, s.Mark);
                    }
                }
                System.out.println();
                break;
            case 2:
                System.out.println("Enter a Name: ");
                String name = sc.nextLine();
                System.out.printf("%-20s %-15s %-15s %-15s", "RollNumber", "Name", "Age", "Mark");
                System.out.println();
                for (Student s : studentVector) {
                    if (s.getName().equalsIgnoreCase(name)) {
                        System.out.printf("%-20d %-15s %-15d %-15.2f", s.RollNumber, s.Name, s.Age, s.Mark);
                    }
                }
                System.out.println();
                break;
            default:
                break;
        }
    }

    public void saveToFile() throws FileNotFoundException {
        FileOutputStream fops = new FileOutputStream("StudentManagement.dat");
        PrintWriter pw = new PrintWriter(fops);

        for (Student s : studentVector) {
            pw.printf("%-20d %-15s %-15d %-15.2f", s.RollNumber, s.Name, s.Age, s.Mark);
            pw.println();
        }
        pw.close();

    }

    public void loadFromFile() throws FileNotFoundException {
        try {
            FileReader fr = new FileReader("StudentManagement.dat");
            BufferedReader input = new BufferedReader(fr);
            System.out.printf("%-20s %-15s %-15s %-15s", "RollNumber", "Name", "Age", "Mark");
            System.out.println();
            for (int i = 0; i < studentVector.size(); i++) {
                System.out.println(input.readLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}



