package fpt.edu.vn;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Monkey.TNT on 11/10/2016.
 */
public class StudentManagement {
    public static void menu() {
        System.out.println("1. Add Students");
        System.out.println("2. Update a Student");
        System.out.println("3. Delete a Student");
        System.out.println("4. Search Students");
        System.out.println("5. Display All Students");
        System.out.println("6. Save to File");
        System.out.println("7. Load from File");
        System.out.println("8. Exit");
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        int choice;
        student.addbefore();
        do {
            menu();
            System.out.println("Your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    student.addStudent();
                    break;
                case 2:
                    student.updates();
                    break;
                case 3:
                    student.deleteStudent();
                    break;
                case 4:
                    student.searchStudent();
                    break;
                case 5:
                    student.displayAllStudent();
                    System.out.println();
                    break;
                case 6:
                    student.saveToFile();
                    break;
                case 7:
                    student.loadFromFile();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("You did choice the wrong!");
                    break;
            }
        } while (choice != 8);
    }
}
