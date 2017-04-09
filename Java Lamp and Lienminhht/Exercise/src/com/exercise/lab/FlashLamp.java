package com.exercise.lab;
import com.exercise.lab.Battery;
/**
 * Created by Monkey.TNT on 10/17/2016.
 */
public class FlashLamp {
    private boolean status;
    private Battery battery;
    public FlashLamp(){
        status=false;
    }
    public  void setBattery(Battery battery){
        this.battery=battery;
    }
    public int getBatteryInfo(){
        return battery.getEnergy();
    }
    public void light() {
        if (status == true && battery != null && battery.getEnergy() > 0) {
            battery.decreaseEnergy();
        }
    }
        public void turnOn(){
        if(battery!=null&&battery.getEnergy()>0){
            status=true;

        }

        light();
        System.out.println(status);
    }
        public void turnOff(){
            status=false;
            System.out.println(status);


    }

    public static void main(String[] args) throws InterruptedException {
        FlashLamp flashLamp = new FlashLamp();
        Battery battery = new Battery();
        flashLamp.setBattery(battery);
        flashLamp.turnOn();
        Thread.sleep(4000);
        flashLamp.turnOff();
        flashLamp.turnOn();
        flashLamp.turnOff();
        flashLamp.turnOn();
        System.out.println(flashLamp.getBatteryInfo());



    }

}
