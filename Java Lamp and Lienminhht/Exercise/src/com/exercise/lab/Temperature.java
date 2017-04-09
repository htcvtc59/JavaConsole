package com.exercise.lab;

/**
 * Created by Monkey.TNT on 10/19/2016.
 */
public class Temperature {
    private  double cTemp;

    public Temperature(double c) {
        this.cTemp = c;
    }
    public double getCTemp(){
        return cTemp;
    }
    public void setCTemp(double c){
        cTemp=c;
    }
    public double getFTemp(){
         return cTemp*1.8+32;
    }
    public double getKTemp(){
        return cTemp+273.15;
    }

    public static void main(String[] args) {
        double Ftemp,Ktemp;
        Temperature temp = new Temperature(25);
        Ftemp=temp.getFTemp();
        Ktemp=temp.getKTemp();
        System.out.println(Ftemp);
        System.out.println(Ktemp);

    }
}
