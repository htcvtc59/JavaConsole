/*
 * AccountInfo.java
 *
 * This application uses Input and Output streams for writing and displaying
 * bank account data.
 * Copyright © 2007 Aptech Software Limited. All Rights Reserved.
 */

package datastream;

import java.util.Scanner;

/**
 * This class displays a menu of options to the user for creating and displaying
 * bank account records.
 * @author vincent
 */
public class AccountInfo {
    
    /**
     * Creates a new instance of AccountInfo
     */
    public AccountInfo() {
    }
    
    
    /**
     * This is the entry point of the application.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Variable to store the action chosen by the user
        int action = 0;
        
        // Create an instance of the Accountinfo class
        Account obj = new Account();
        Scanner scan = new Scanner(System.in);
        
        // Display a menu of options to the user
        do {
            System.out.println("\n\t *** Welcome to Indus Bank Online *** \t");
            System.out.println("1. Create a new account");
            System.out.println("2. Display account information");
            System.out.println("3. Exit");
            System.out.println("Select the operation you want to perform:");
            action = scan.nextInt();
            
            // Perform the action chosen by the user
            switch(action) {
                case 1:
                    obj.addAccount();
                    break;
                case 2:
                    obj.display();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Enter a valid option!");
                    break;
            }
        } while(action != 3);
    }
}
