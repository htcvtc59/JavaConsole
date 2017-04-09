package com.exercise.lab;
import java.util.*;

/**
 * Created by Monkey.TNT on 10/19/2016.
 */
public class RectangleDemo {
    public static void main(String[] args) {
        int area,perimeter;
        Rectangle rec=new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width for rec:");
        rec.setWidth(sc.nextInt());
        System.out.println("Enter the height for rec:");
        rec.setHeihgt(sc.nextInt());
        area = rec.getArea();
        perimeter = rec.getPerimeter();
        System.out.println("The area for rec is: " + area);
        System.out.println("The pereimeter for rec is: " + perimeter);
        rec.display();


    }
}
