package com.edu.vn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Monkey.TNT on 10/27/2016.
 */
public class Employee {
    private int employeeID;
    private String employeename;
    private String designation;
    private float salary;
    private float sales;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSales() {
        return sales;
    }

    public void setSales(float sales) {
        this.sales = sales;
    }

    public Employee() {
        this(0, "", "", 0, 0);
    }

    public Employee(int employeeID, String employeename, String designation, float salary, float sales) {
        this.employeeID = employeeID;
        this.employeename = employeename;
        this.designation = designation;
        this.salary = salary;
        this.sales = sales;
    }

    public void inputemployee(ArrayList<Employee> employeeArrayList, Count n) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập sô lượng employee: ");
        n.setN(sc.nextInt());
        for (int i = 0; i < n.getN(); i++) {
            Employee employee = new Employee();
            System.out.println("Employee " + i);
            sc.nextLine();
            System.out.print("EmployeeID: ");
            int employeeID = sc.nextInt();
            sc.nextLine();
            System.out.println("EmployeeName: ");
            String employeename = sc.nextLine();
            System.out.println("Designation: ");
            String designation = sc.nextLine();
            System.out.println("Salary: ");
            float salary = sc.nextFloat();
            System.out.println("Sales: ");
            float sales = sc.nextFloat();
            employee.setEmployeeID(employeeID);
            employee.setEmployeename(employeename);
            employee.setDesignation(designation);
            employee.setSalary(salary);
            employee.setSales(sales);
            employeeArrayList.add(employee);
        }
    }

    public void displayee() throws Exception {
        try {
            System.out.printf("\n%-14d %-15s %-15s %-15.3f %-15.3f", employeeID, employeename, designation, salary, sales);
        } catch (Exception ex) {
            throw ex;
        }


    }
}


