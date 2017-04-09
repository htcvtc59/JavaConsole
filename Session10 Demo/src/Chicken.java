/**
 * Created by Monkey.TNT on 10/28/2016.
 */
public class Chicken extends Brid {
    @Override
    public void fly(){
        System.out.println(name+" bay len dong rom");
    }

    @Override
    public void run() {
        super.run();
        System.out.println(name+"lac mong");

    }
}
