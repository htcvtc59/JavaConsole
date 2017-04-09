/*
 * AppointDoctor.java
 *
 * This program demonstrates the usage of a Priority Queue to compare and
 * prioritize the appointments and the doctor is assigned to a higher priority
 * appointment.
 *
 * Copyright © 2007 Aptech Software Limited. All Rights Reserved.
 */

package lifecare;

import java.util.PriorityQueue;

/**
 * AppointDoctor is a class to where appointments are compared and prioritized
 * and the doctor is assigned to a higher priority appointment.
 * @author vincent
 */
public class AppointDoctor {
  
  /** Creates a new instance of AppointDoctor */
  public AppointDoctor() {
  }
  
  /**
   * This is the entry point of the application.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    // Creating a PriorityQueue
    PriorityQueue pq = new PriorityQueue();
    
    // Creating Doctor objects
    Doctor Cardiologist = new Doctor("Casuality", 1);
    Doctor Gynecologist = new Doctor("Surgery", 2);
    Doctor Paediatric= new Doctor("Routine Chek-up", 3);
    
    // Adding Doctor objects to the Queue
    pq.offer(Cardiologist);
    pq.offer(Gynecologist);
    pq.offer(Paediatric);
    
    // Remove The elements from the Queue as per their priorities
    while(!pq.isEmpty()) {
      // Displaying the header information
      System.out.println("\nAppointing doctors based on their priorities:");
      System.out.println("******************************************");
      
      // Removing the Doctors as per their priorities
      Doctor doctor = ((Doctor) pq.remove());
      
      //Invoking the toString() method
      System.out.println(doctor.toString());
    }
    
  }
  
}
