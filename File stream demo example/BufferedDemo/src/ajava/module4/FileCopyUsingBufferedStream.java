package ajava.module4;

/**
 * @(#)FileCopyUsingBufferedStream.java
 *
 *
 * @author tunn
 * @version 1.00 2009/7/14
 */


import java.io.*;
public class FileCopyUsingBufferedStream {
   public static void main(String[] args) {
   	
      File fileIn;
      BufferedInputStream in = null;
      BufferedOutputStream out = null;
      long startTime, elapsedTime;  // for speed benchmarking
 
      try {
         fileIn = new File("Garden.jpg");
         System.out.println("File size is " + fileIn.length() + " bytes");
         in  = new BufferedInputStream(new FileInputStream(fileIn));
         out = new BufferedOutputStream(new FileOutputStream("Garden-out.jpg"));
         startTime = System.nanoTime();
         int byteRead;
         while ((byteRead = in.read()) != -1) {
            out.write(byteRead);
         }
         elapsedTime = System.nanoTime() - startTime;
         System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
      } catch (IOException ex) {
         ex.printStackTrace();
      } finally {            // always close the streams
         try {
            if (in != null) in.close();
            if (out != null) out.close();
         } catch (IOException ex) { ex.printStackTrace(); }
      }
   }
}
