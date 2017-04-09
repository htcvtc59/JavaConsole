import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Monkey.TNT on 11/22/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        Đọc dữ liệu từ file dùng luồng byte
      FileInputStream fileInputStream= new FileInputStream("C:\\Users\\Monkey.TNT\\Desktop\\Object-Oeierted.txt");
      int i;
        do{
            i=fileInputStream.read();
            if(i !=-1){
                System.out.println((char)i);
            }
        }while (i!=-1);
        fileInputStream.close();

//        Ghi dữ liệu xuống file dùng luồng byte
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Monkey.TNT\\Desktop\\output.txt");
        int j='z';
        for (int a = 'a'; a < j; a++) {
            fileOutputStream.write(a);
        }
        fileOutputStream.close();
    }
}
