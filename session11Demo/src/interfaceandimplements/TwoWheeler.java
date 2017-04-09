package interfaceandimplements;

/**
 * Created by Monkey.TNT on 11/1/2016.
 */

public class TwoWheeler implements IVehicle,IManufacturer {
    String ID;
    String type;

    public TwoWheeler(String ID, String type) {
        this.ID = ID;
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("Starting the " + type);
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Accelerating at speed:" + speed + "kmph");
    }

    @Override
    public void brake() {
        System.out.println("Applying brakes...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the " + type);
    }
    //Manufacturer
    @Override
    public void addContact(String detail){
        System.out.println("Manufacturer: "+detail);
    }
    @Override
    public void callManufacturer(String phone){
        System.out.println("Calling Manufacturer @:"+phone);
    }
    @Override
    public void makePayment(float amount){
        System.out.println("Payable Amount:$"+amount);
    }


    public void displayDetails() {
        System.out.println("VehicleNo.: " + STATEID + "" + ID);
        System.out.println("VehicleType.: " + type);
    }
}

class TestVehicle{
    public static void main(String[] args) {
        if (true){
            TwoWheeler objBike= new TwoWheeler("CS-272","Bike");
            objBike.displayDetails();
            objBike.start();
            objBike.accelerate(Integer.parseInt("80"));
            objBike.brake();
            objBike.stop();
            objBike.addContact("BN-Bikes");
            objBike.callManufacturer("808-283-2828");
            objBike.makePayment(300);

        }else{
            System.out.println("Usage: java interfaceandimplements.TwoWheeler<ID><Type><Speed>");
        }
    }
}

