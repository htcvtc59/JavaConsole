package fpt.edu.com;

/**
 * Created by Monkey.TNT on 11/1/2016.
 */
interface Shape {
    public abstract void drawShape();
    public abstract void calcArea(float val);
}

interface IAnimate {
   public abstract void rotateObject(int degree);

    public abstract void flipObject(int direction);

    public abstract void moveObject(int distance);
}

class Circle implements Shape,IAnimate {
    @Override
    public void drawShape() {
        System.out.println("Drawing Circle ...");
    }

    @Override
    public void calcArea(float rad) {
        System.out.println("Area of Circle is: " + rad);
    }

    @Override
    public void rotateObject(int degree) {
        System.out.println("Rotating Circle by " + degree + " degrees");
    }

    @Override
    public void flipObject(int direction) {
        System.out.println("Flipping Circle " + direction);
    }

    @Override
    public void moveObject(int distance) {
        System.out.println("Moving Circle by" + distance + "cm");
    }

}
class RunCircle{
    public static void main(String[] args) {
        Circle objCircle = new Circle();
        objCircle.drawShape();
        objCircle.calcArea(Float.parseFloat("1256.0"));
        objCircle.rotateObject(Integer.parseInt("30"));
    }
}


