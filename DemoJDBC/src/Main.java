import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Monkey.TNT on 11/14/2016.
 */
public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ProductManager m = new ProductManager();
        Product product = new Product();
        Scanner sc = new Scanner(System.in);
        int input;
            do {
                System.out.println(String.format(" 1.delete\n 2.update\n 3.create\n 4.select\n 5.search"));
                System.out.println("Enter: ");
                input = sc.nextInt();
                sc.nextLine();
                switch (input) {
                    case 1:
                        m.delete(4);
                        break;
                    case 2:
                        product.setName("google");
                        product.setPrice(600);
                        m.update(4, product);
                        break;
                    case 3:
                        m.create(new Product(4, "ipod", 400));
                        break;
                    case 4:
                        List<Product> data = m.getAll();
                        data.forEach(x -> {
                            System.out.println(x.id + " - " + x.name + " - " + x.price);
                        });
                        break;
                    case 5:
                        System.out.println("Enter name: ");
                       String name =sc.nextLine();
                        List<Product> data1 = m.search(name);
                        data1.forEach( x ->{
                            System.out.println(x.id + " - " + x.name + " - " + x.price);
                        });
                        break;
                    case 6:
                        m.insert(new Product(10,"google",200));
                        break;
                    case 10:
                        break;
                    default:
                        break;
                }
            } while (input !=10);
        m.close();
    }
}
