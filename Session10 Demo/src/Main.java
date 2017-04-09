/**
 * Created by Monkey.TNT on 10/28/2016.
 */
public class Main {
    public static void main(String[] args) {
        Animal cat= new Animal();
        cat.name="meo";
        cat.run();

        Animal mouse= new Animal();
        cat.name="jerry";
        cat.run();

        Brid bird =new Brid();
        bird.name="angrybird";
        bird.fly();


        Chicken chicken= new Chicken();
        chicken.name="KFC";
        chicken.fly();
        chicken.run();
    }
}
