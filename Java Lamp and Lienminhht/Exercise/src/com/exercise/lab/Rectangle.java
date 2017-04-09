package com.exercise.lab;

/**
 * Created by Monkey.TNT on 10/19/2016.
 */
public class Rectangle {
    private int width;
    private int heihgt;
    private static int counter = 0;

    public Rectangle() {
        width = 1;
        heihgt = 1;
        counter++;
    }
    public Rectangle(int w, int h) {
        this.width = w;
        this.heihgt = h;
        counter++;
    }
    public void setWidth(int w){
         width=w;
    }
    public void setHeihgt(int h){
        heihgt=h;
    }
    public int getWidth(){
        return width;
    }
    public int getHeihgt(){
        return heihgt;
    }
    public int getArea(){
        return width*heihgt;
    }
    public int getPerimeter(){
        return 2*(width+heihgt);
    }
    public static int getInstances(){
        return counter;
    }
    public void display(){
        for(int i=0;i<this.heihgt;i++)
        {
            System.out.println("");
            for(int j=0; j<this.width; j++){
                System.out.print("#");
            }
        }
    }

}


