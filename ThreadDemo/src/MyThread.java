/**
 * Created by Monkey.TNT on 11/18/2016.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println(this.getName()+": "+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1= new MyThread();
        MyThread t2= new MyThread();
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
        t1.join(4000);
        Thread.sleep(2000);
    }
}
