package com.exercise.lab;

/**
 * Created by Monkey.TNT on 10/17/2016.
 */
public class Battery {
    private int energy;
    public Battery(){
        energy=3;
    }

    public int getEnergy(){
        return energy;
    }


    public void setEnergy(int value){
        this.energy=value;
    }

    public void decreaseEnergy(){
        energy--;
    }

}
