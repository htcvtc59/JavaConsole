package com.exercise.lab;
/**
 * Created by Monkey.TNT on 10/17/2016.
 */
public class Student {
    public int id;
    public String name;
    public boolean gender;


    public Student() {
        this.id = -1;
        this.name = "noname";
        this.gender = true;
    }

    public Student(int id, String name, boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int value) {
        this.id = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public boolean isMale() {
        return this.gender;
    }

    public void setMale(boolean value) {
        this.gender = value;
    }

    public void printInfo() {
        System.out.println("-------------------");
        System.out.println("|ID|    Name    |Male|");
        System.out.println("|"+this.id+"| "+"| " +this.name +"|"+"|"+ this.gender+"|");
    }

}
