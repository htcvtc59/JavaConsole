/*
 * Doctor.java
 *
 * This program demonstrates the usage of a Compearable interface to compare and
 * prioritize the appointments and the doctor is assigned to a higher priority
 * appointment.
 *
 * Copyright © 2007 Aptech Software Limited. All Rights Reserved.
 */

package lifecare;

/**
 * Doctor is a class to where appointments are compared and prioritized and the
 * doctor is assigned to a higher priority appointment.
 * @author vincent
 */
public class Doctor implements Comparable {
  
  /**
   * Creates a new instance of Doctor
   * @param name to store the name of the doctor
   * @param task to store the priority of the appointment
   */
  public Doctor(String name, int task) {
    
    this.name = name;
    this.task = task;
  }
  
  /** Creates a new instance of Doctor */
  public Doctor() {
  }
  
  /**
   * This method is invoked to create a Runtime instance and execute the paint
   * application using the Runtime instance.
   * @param obj passed to compare the Doctor objects
   * @return the integer values as priorities
   */
  public int compareTo(Object obj) {
    // Create a Doctor object
    Doctor doc = (Doctor) obj;
    
    int a = 0;
    int b = 0;
    a = this.task;
    b = doc.task;
    
    // Highest number determines the highest priority for the appointments
    if (a<b)
      return -1;
    if (a>b)
      return 1;
    return 0;
  }
  
  /**
   * Overriding the toString() method to print the doctor appointment details
   * @return the string that contains the doctor appointment details
   */
  public String toString() {
    return "\nThe Doctor is appointed for = " + name +  "\nThe prority " +
        "for the appointment is = " + task ;
  }
  
  /** Declare and initialize the variable to store the name of the doctor. */
  private String name = "";
  
  /**
   * Declare and initialize the variable to store the priority of the
   * appointment.
   */
  private int task = 0;
}
