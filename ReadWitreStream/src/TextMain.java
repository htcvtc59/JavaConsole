import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by Monkey.TNT on 11/11/2016.
 */
public class TextMain {
    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("C:\\Users\\Monkey.TNT\\Desktop\\code.txt");
//        String a = null;
//        try {
//            a = Textfile.readFileNormal(file);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println(a);

//File file=new File("C:\\Users\\Monkey.TNT\\Desktop\\codedemo.txt");
//        try {
//            Textfile.writeFileNormal("Iam go to school",file);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }


//Buffered
        File file = new File("C:\\Users\\Monkey.TNT\\Desktop\\codedemo.txt");
        Textfile.readFileUserinhDataReader(file);


    }


}
