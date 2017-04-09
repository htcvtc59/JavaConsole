package com.edu.vn;

import java.util.ArrayList;

/**
 * Created by Monkey.TNT on 10/28/2016.
 */
public class FunctionEmployee {
    public static void displayemployee(ArrayList<Employee> employeeArrayList, int n) throws Exception {
        try {
            System.out.printf("\n%-14s %-15s %-15s %-15s %-15s", "employeeID", "employeename", "designation", "salary", "sales");
            for (int i = 0; i < n; i++) {
                System.out.printf("\n");
                employeeArrayList.get(i).displayee();
            }
            System.out.println();
        } catch (Exception ex) {
            throw ex;
        }
    }


//    public static int sreach(ArrayList<Employee>employeeArrayList,int[]a,int n)throws Exception{
//        int count = 0;
//        try {
//
//            }
//            return count;
//        }catch (Exception ex){
//            throw ex;
//        }


    public static void totalemployee(ArrayList<Employee> employeeArrayList, int n) throws Exception {
        int[] a = new int[n];
        int count = 0;
        String []b = new String[n];
        String total = null;
        float sales, salary;
        for (int i = 0; i < n; i++) {
            sales = employeeArrayList.get(i).getSales();
            salary = employeeArrayList.get(i).getSalary();
            if (sales >= 4000 && sales < 6000) {
                total = salary + 0.1 * salary + "";
                b[count]=total;
                a[count] = i;
                count++;
            }else if (sales >= 6000 && sales < 8000) {
                total = salary + 0.2 * salary + "";
                b[count]=total;
                a[count] = i;
                count++;
            }else if (sales >= 8000 && sales < 10000) {
                total = salary + 0.3 * salary + "";
                b[count]=total;
                a[count] = i;
                count++;
            }else if (sales >= 10000) {
                total = salary + 0.3 * salary + "";
                b[count]=total;
                a[count] = i;
                count++;
            }

        }
        System.out.printf("\n%-14s %-15s %-15s %-15s %-14s %-15s", "employeeID", "employeename", "designation", "salary", "sales","total");
        try {
            if (count>0) {
                for (int i = 0; i < count; i++) {
                    employeeArrayList.get(a[i]).displayee();
                    System.out.printf("%-15s", b[i]);
                    }

                }


        } catch (Exception ex) {
            throw ex;
        }

    }


    public static void createemployee(ArrayList<Employee> employeeArrayList, Count n) {
        n.setN(5);
        Employee employee = new Employee(0, "Minh", "Director", 100, 10000);
        Employee employee1 = new Employee(1, "Long", "Director", 600, 7000);
        Employee employee2 = new Employee(2, "Du", "Director", 100, 4300);
        Employee employee3 = new Employee(3, "Tran", "Director", 300, 4000);
        Employee employee4 = new Employee(4, "Tuan", "Director", 100, 8000);
        employeeArrayList.add(employee);
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);
        employeeArrayList.add(employee4);

    }


}
