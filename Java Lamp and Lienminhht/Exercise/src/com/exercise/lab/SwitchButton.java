package com.exercise.lab;

import javax.sound.midi.Soundbank;

/**
 * Created by Monkey.TNT on 10/19/2016.
 */
public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;

    public void connectToLamp(ElectricLamp e){
        this.lamp = e;
    }
    public void switchOff(){
        this.status=false;
        lamp.turnOff();
    }
    public void switchOn(){
        this.status=true;
        lamp.turnOn();
    }
    public void display(){
        System.out.println(lamp);
    }

}
