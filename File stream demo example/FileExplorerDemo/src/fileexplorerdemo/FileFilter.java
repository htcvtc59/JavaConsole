package fileexplorerdemo;

/**
 * @(#)FileFilter.java
 *
 *
 * @author tunn
 * @version 1.00 2009/7/14
 */


// List all the files end with ".java"
import java.io.File;
import java.io.FilenameFilter;
public class FileFilter {
   public static void main(String[] args) {
      File dir = new File(".");     // current working directory
      if (dir.isDirectory()) {
         String[] files = dir.list(new FilenameFilter() {
            public boolean accept(File dir, String file) {
               return file.endsWith(".java");
            }
         });    // an anonymous inner class as FilenameFilter
         for (String file : files) {
            System.out.println(file);
         }
      }
   }
}
