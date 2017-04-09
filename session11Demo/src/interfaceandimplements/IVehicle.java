package interfaceandimplements;

/**
 * Created by Monkey.TNT on 11/1/2016.
 */
public interface IVehicle {
    static final String STATEID = "LA-09";

    public void start();


    public void accelerate(int speed);


    public void brake();


    public void stop();
}

