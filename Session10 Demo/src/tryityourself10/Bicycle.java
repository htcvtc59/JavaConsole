package tryityourself10;

/**
 * Created by Monkey.TNT on 10/28/2016.
 */
public class Bicycle extends Twowheeler{
    boolean gear;
    public Bicycle(String vId, String vName, int types, float price, boolean gear){
        super(vId,vName,types,price);
        this.gear=gear;
    }
    @Override
    public void printDetails(){

        if(gear==true) {
            super.printDetails();
            System.out.println("Geared: Yes");
        }

        else
            System.out.println("Geared: No");
    }

    public static void main(String[] args) {
        Twowheeler obj=new Bicycle("B001","Mountain-Bicycle", Integer.parseInt("2"),Float.parseFloat("200.0"),Boolean.parseBoolean("true"));
        obj.printDetails();
    }
}
