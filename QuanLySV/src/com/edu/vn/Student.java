package com.edu.vn;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private int Id;
    private String Name;
    private float cMark;
    private float javaMark;
    private float htmlMark;
    private float javascriptMark;
    private float androidMark;

    public int getId() {
        return Id;
    }
    public void setId(int id){
        this.Id=id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name){
        this.Name = name;
    }
    public float getcMark() {
        return cMark;
    }
    public void setcMark(float cMark) {
        this.cMark = cMark;
    }
    public float getJavaMark() {
        return javaMark;
    }
    public void setJavaMark(float javaMark) {
        this.javaMark = javaMark;
    }
    public float getHtmlMark() {
        return htmlMark;
    }
    public void setHtmlMark(float htmlMark) {
        this.htmlMark = htmlMark;
    }
    public float getJavascriptMark() {
        return javascriptMark;
    }
    public void setJavascriptMark(float javascriptMark) {
        this.javascriptMark = javascriptMark;
    }
    public float getAndroidMark() {
        return androidMark;
    }
    public void setAndroidMark(float androidMark) {
        this.androidMark = androidMark;
    }
    public Student(){
        this(0,"",0,0,0,0,0);
    }
    public Student(int Id,String Name,float cMark,float javaMark,float htmlMark,float javascriptMark,float androidMark){
        this.Id=Id;
        this.Name=Name;
        this.cMark=cMark;
        this.javaMark=javaMark;
        this.htmlMark=htmlMark;
        this.javascriptMark=javascriptMark;
        this.androidMark=androidMark;
    }

    public boolean check;
    public boolean check(boolean check1){
        this.check = check1;
        return check;
    }


    public void InputStudent(ArrayList<Student> studentArrayList,Count n) {
        Scanner inputid = new Scanner(System.in);
        Scanner inputname = new Scanner(System.in);
        Scanner inputint = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số học sinh: ");
        n.setN(input.nextInt());
        for (int i = 1; i <= n.getN(); i++) {
            Student student = new Student();
            System.out.println("Học sinh thứ " + i);
            input.nextLine();
            System.out.print("Mời Bạn Nhập ID: ");
            int Id = inputid.nextInt();
            System.out.print("Mời Bạn Nhập Họ Và Tên: ");
            String Name = inputname.nextLine();
            System.out.print("Mời Bạn Nhập Điểm C: ");
            float cMark = inputint.nextFloat();
            System.out.print("Mời Bạn Nhập Điểm Java: ");
            float javaMark = inputint.nextFloat();
            System.out.print("Mời Bạn Nhập Điểm Html: ");
            float htmlMark = inputint.nextFloat();
            System.out.print("Mời Bạn Nhập Điểm JavaScript: ");
            float javascriptMark = inputint.nextFloat();
            System.out.print("Mời Bạn Nhập Điểm Android: ");
            float androidMark = inputint.nextFloat();
            student.setId(Id);
            student.setName(Name);
            student.setcMark(cMark);
            student.setJavaMark(javaMark);
            student.setHtmlMark(htmlMark);
            student.setJavascriptMark(javascriptMark);
            student.setAndroidMark(androidMark);
            studentArrayList.add(student);
        }

    }


    public void displaystudent() throws Exception{
        try {
            System.out.printf("| %-10d | %-33s | %-17.2f | %-17.2f | %-17.2f | %-17.2f | %-17.2f |",Id,Name,cMark,javaMark,htmlMark,javascriptMark,androidMark);
        }
        catch (Exception exception){
            throw exception;
        }
    }

}


