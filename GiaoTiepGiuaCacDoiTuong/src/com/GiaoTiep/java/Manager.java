package com.GiaoTiep.java;

/**
 * Created by Monkey.TNT on 10/21/2016.
 */
public class Manager {
    public Manager() {
    }

    public String request(Employee employee) {
        employee.setName("007");
        return "ok";
    }
}
