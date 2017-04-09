import java.io.File;

/**
 * Created by Monkey.TNT on 11/11/2016.
 */
public class Main {

   public static void listFile(File file){
       if(file.isDirectory()){
           for(File f:file.listFiles() ){
               listFile(f);
           }
       }
           System.out.println(file.getName());
   }
    public static void main(String[] args) {
        File file = new File("C:\\xampp");
        listFile(file);


    }
}
