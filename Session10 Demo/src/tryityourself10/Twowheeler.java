package tryityourself10;

/**
 * Created by Monkey.TNT on 10/28/2016.
 */
public class Twowheeler {
    String vehicleId;
    String type;
    int wheels;
    float price;
    public Twowheeler(String vId,String vType,int types,float rate){
        vehicleId=vId;
        type=vType;
        wheels=types;
        price=rate;
    }
    public void printDetails(){

        System.out.println("Bicycle Id: "+vehicleId);
        System.out.println("Bicycle Type: "+type);
        System.out.println("Wheels: "+wheels);
        System.out.println("Price: $"+price);
    }
}
