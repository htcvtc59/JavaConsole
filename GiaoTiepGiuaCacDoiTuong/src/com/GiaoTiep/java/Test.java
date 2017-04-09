package com.GiaoTiep.java;

/**
 * Created by Monkey.TNT on 10/21/2016.
 */
public class Test {
    public static void main(String[] args) {
        Manager man = new Manager();
        Employee emp = new Employee("Nguyen A");
        if (man.request(emp).equals("ok")) {
            System.out.println("Doi ten thanh cong");
            System.out.println("Ten moi cua employee :" + emp.getName());
        } else {
            System.out.println("Khong doi ten duoc");
        }
    }
}
