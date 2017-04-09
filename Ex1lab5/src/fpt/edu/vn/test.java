package fpt.edu.vn;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Monkey.TNT on 11/22/2016.
 */
public class test {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Monkey.TNT\\Desktop\\output.txt");
        FileReader  fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line="";
      while ((line=bufferedReader.readLine()) !=null) {
          System.out.println(line);
      }
        fileReader.close();
        bufferedReader.close();

    }
}
