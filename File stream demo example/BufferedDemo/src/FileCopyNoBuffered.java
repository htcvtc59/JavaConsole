/**
 * @(#)FileCopyNoBuffered.java
 *
 *
 * @author tunn
 * @version 1.00 2009/7/14
 */


import java.io.*;
public class FileCopyNoBuffered {
   public static void main(String[] args) {
      File fileIn;
      FileInputStream in = null;
      FileOutputStream out = null;
      long startTime, elapsedTime;  // for speed benchmarking
 
      try {
         fileIn = new File("Garden.jpg");
         System.out.println("File size is " + fileIn.length() + " bytes");
         in = new FileInputStream(fileIn);
         out = new FileOutputStream("Garden-out.jpg");
 
         startTime = System.nanoTime();
         int byteRead;
         // Read a unsigned byte (0-255) and padded to 32-bit int
         while ((byteRead = in.read()) != -1) {
            // Write the least significant byte, drop the upper 3 bytes
            out.write(byteRead);
         }
         elapsedTime = System.nanoTime() - startTime;
         System.out.println("Elapsed Time is " + (elapsedTime / 1000000.0) + " msec");
      } catch (IOException ex) {
         ex.printStackTrace();
      } finally {       // always close the streams
         try {
            if (in != null) in.close();
            if (out != null) out.close();
         } catch (IOException ex) { ex.printStackTrace(); }
      }
   }
}
