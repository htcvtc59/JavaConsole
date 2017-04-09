/*
 * Employee.java
 *
 * This class stores information about employees and implements the serializable
 * interface. Objects of this class can be serialized and written to a file.
 * Copyright © 2007 Aptech Software Limited. All Rights Reserved.
 */

package employeedetails;

import java.io.Serializable;

/**
 * This class stores details of an employee.
 * @author vincent
 */
public class Employee implements Serializable {
    
    /** Creates a new instance of Employee */
    public Employee() {
    }
    
    /** Creates and initializes a new instance of Employee */
    public Employee( String name, int exp, double sal) {
        // Constructor for storing values to the variables.
        this.name = name;
        this.experience = exp;
        this.salary = sal;
    }
    
    /** This method is invoked to convert an object to a string */
    public String toString() {
        // Return the values of the variables as a string
        return "Name = "+ name + " Experience : " + experience +" Income : "+
                salary;
    }
    
    /**Instance variable to store the name of the Employee. */
    private String name;
    
    /** Instance variable to store the experience of the employee. */
    private int experience;
    
    /** Instance variable to store the salary drawn by the employee. */
    private double salary;
    
}
