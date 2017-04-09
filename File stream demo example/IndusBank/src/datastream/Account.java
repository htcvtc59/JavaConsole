/*
 * Account.java
 *
 * This class stores basic information about a bank account.
 * Copyright © 2007 Aptech Software Limited. All Rights Reserved.
 */

package datastream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 * This class can store and display a user's account information from a text
 * file.
 * @author vincent
 */
public class Account {
    
    /**
     * Constructor to create and initialize an instance of Account class.
     */
    protected Account() {
    }
    
    /**
     * This method is invoked to accept account details from the user.
     */
    public void addAccount() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the account holder's First Name:");
        this.firstName = scan.next();
        System.out.println("Enter the account holder's Last Name:");
        this.lastName = scan.next();
        System.out.println("Enter the account holder's age:");
        this.age = scan.nextInt();
        System.out.println("Enter the starting balance of the account:");
        this.accountBalance = scan.nextFloat();
        
        // Write the account details back to the file
        this.saveState();
        
    }
    
    /**
     * This method is invoked to save the account details in the file.
     */
    public void saveState() {
        try {
            FileWriter fwriter = new FileWriter("Account.txt", true);
            BufferedWriter writer = new BufferedWriter(fwriter);
            writer.write(this.lastName);
            writer.write("\t");
            writer.write(this.firstName);
            writer.write("\t");
            writer.write(Integer.toString(this.age));
            writer.write("\t");
            writer.write(Float.toString(this.accountBalance));
            writer.write("\t");
            writer.newLine();
            writer.close();
            fwriter.close();
        } catch (FileNotFoundException ex) {
            System.out.println("The requested file cannot be found.");
        } catch (IOException ex) {
            System.out.println("An error occurred while writing to the file.");
        }
        
    }
    
    /**
     * This method is invoked to display all the records stored in the file.
     */
    public void display(){
        System.out.println(" **** Account Details **** \n");
        System.out.format(" %1$-1s | %2$s | %3$8s | %4$-10s | \n",
                "Last Name", "First Name", "Age", "Account Balance($)");
        try {
            FileReader input = new FileReader("Account.txt");
            BufferedReader reader = new BufferedReader(input);
            String record;
            while((record = reader.readLine()) != null) {
                StringTokenizer token = new StringTokenizer(record);
                while(token.hasMoreTokens())
                    System.out.print(token.nextToken("\t") + "\t\t");
                System.out.println("");
            }
            reader.close();
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
    /** Instance variable to store the first name of the customer. */
    private String firstName;
    
    /** Instance variable to store the last name of the customer. */
    private String lastName;
    
    /** Instance variable to store the age of the customer. */
    private int age;
    
    /** Instance variable to store the account information. */
    private float accountBalance;
    
}
