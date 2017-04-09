package edu.fpt.lmht;

import java.util.Scanner;

/**
 * Created by Monkey.TNT on 10/19/2016.
 */
public class Lmht {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc= new Scanner(System.in);

        Champion ahri=new Champion();
        ahri.name="Ahri";
        ahri.hp=1000;
        ahri.dame=100;

        Champion wukong=new Champion();
        wukong.name="Wukong";
        wukong.hp=600;
        wukong.dame=50;
while (wukong.hp>0&&ahri.hp>0){
    int c=sc.nextInt();
    if(c==0){
        ahri.Q(wukong);
        Thread.sleep(1000);
    }else{
        wukong.Q(ahri);
    }
}
    }
}
