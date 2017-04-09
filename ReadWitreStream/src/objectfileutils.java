import java.io.*;

/**
 * Created by Monkey.TNT on 11/11/2016.
 */
public class objectfileutils {
    public static void wirte() throws FileNotFoundException{
        FileOutputStream out=new FileOutputStream("myproduct.dat");
        ObjectOutputStream oos= new ObjectOutputStream(out);
        produc p= new produc();
        p.name="Iphone";
        oos.writeObject(p);
        oos.close();
        out.close();
    }
    public static void read(){
        FileInputStream out = new FileInputStream("myproduct.dat");
        ObjectInputStream ois = new ObjectInputStream(out);
        produc p = (produc)ois.readObject();
        System.out.println(p.toString());
    }

    public static void main(String[] args)throws IOException {
        read();

    }
}
