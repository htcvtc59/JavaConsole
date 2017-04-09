package com.edu.vn;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Monkey.TNT on 10/27/2016.
 */
public class Main {

    public static void main (String[]args){
        try
        {   int touch;
            ArrayList<Employee> employeeArrayList = new ArrayList<>();
            Count n = new Count();
            FunctionEmployee.createemployee(employeeArrayList,n);
            Employee employee = new Employee();
            do {
                System.out.print("\nDa co danh sach Employee");
                System.out.print("\n1.Nhap moi");
                System.out.print("\n2.Hien thi");
                System.out.print("\n3.Hien thi total");
                System.out.print("\n0.Thoat");
                Scanner sc = new Scanner(System.in);
                System.out.print("\nBan nhap phim: ");
                touch = sc.nextInt();
                System.out.flush();
                switch (touch) {
                    case 1:
                        employee.inputemployee(employeeArrayList, n);
                        break;
                    case 2:
                        FunctionEmployee.displayemployee(employeeArrayList,n.getN());
                        break;
                    case 3:
                         FunctionEmployee.totalemployee(employeeArrayList,n.getN());
                        break;
                    case 0:
                        System.out.print("\n Thoat!");
                    default:
                        System.out.print("\nKhong co phim chuc nang nay !");
                        break;
                }


            } while (touch != 0);
        }catch (Exception ex){
            System.exit(0);
        }
    }
}
