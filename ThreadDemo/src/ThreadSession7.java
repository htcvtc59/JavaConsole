/**
 * Created by Monkey.TNT on 11/18/2016.
 */
public class ThreadSession7 {

    public static void first()throws InterruptedException{
        Thread.sleep(3000);
        System.out.println("First");
    }
    public static void second()throws InterruptedException{
        Thread.sleep(4000);
        System.out.println("Second");
    }
    public static void main(String[] args)throws InterruptedException {
        first();
        second();
    }

}
