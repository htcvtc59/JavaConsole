import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Monkey.TNT on 11/23/2016.
 */
public class Main {


    public static void menu() {
        System.out.println("1. Add new Students");
        System.out.println("2. Save");
        System.out.println("3. Display all Student");
        System.out.println("4. Exit");
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
            sc.nextLine();
            switch (choice) {
                case 1:
                    student.Add();
                    break;
                case 2:
                    student.Save();
                    break;
                case 3:
                    student.Display();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("You did choice the wrong!");
                    break;
            }
        } while (choice != 4);
    }
}
