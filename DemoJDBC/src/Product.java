/**
 * Created by Monkey.TNT on 11/14/2016.
 */
public class Product {
    public int id;
    public String name;
    public float price;

    public Product(int id,String name,float price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    public Product(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}


