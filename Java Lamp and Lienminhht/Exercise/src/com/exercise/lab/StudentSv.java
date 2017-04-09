package com.exercise.lab;

/**
 * Created by Monkey.TNT on 10/17/2016.
 */
public class StudentSv {
    public static void main(String[] args) {
        Student studentA;
        Student studentB;
        studentA=new Student();
        studentB= new Student(1,"Nguyen An",true);
        studentB.printInfo();
        studentB.setName("Nguyen An");
        studentB.printInfo();

    }
}

