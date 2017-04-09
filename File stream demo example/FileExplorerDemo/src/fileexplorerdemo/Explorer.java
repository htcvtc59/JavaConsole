package fileexplorerdemo;

/**
 * @(#)Explorer.java
 *
 *
 * @author tunn
 * @version 1.00 2009/7/14
 */


// Recursively list the contents of a directory
import java.io.File;
public class Explorer {
   public static void main(String[] args) {
      File dir = new File("C:\\Program Files\\Microsoft Office");
      listRecursive(dir);
   }

   /**
    * 
    * @param dir
    * if dir is a directory, print all files inside dir,
    * and call to listRecursive itself with  dir is each of all its subdirectories
    * This method will list all files and and subdirectories of a direcotory.
    */
   public static void listRecursive(File dir) {
      if (dir.isDirectory()) {
         File[] items = dir.listFiles();
         for (File item : items) {
            System.out.println(item.getAbsoluteFile());
            if (item.isDirectory()) {
            	listRecursive(item);
            }
         }
      }
   }
}
