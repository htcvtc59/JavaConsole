package readerwriterdemo;

/**
 * @(#)UnicodeFileIO.java
 *
 *
 * @author tunn
 * @version 1.00 2009/7/14
 */


import java.io.*;
public class UnicodeFileIO {
   public static void main(String[] args) {
      try {
         FileOutputStream fos = new FileOutputStream("TestUTF8.txt");
         Writer out = new OutputStreamWriter(fos, "UTF-8");   // Output file UTF-8 encoded
         out.write("Hello, Vi\u1EC7t Nam\n");
         out.close();
 
         // Character-based (or text-based) input
         FileInputStream fis = new FileInputStream("TestUTF8.txt");
         Reader in = new InputStreamReader(fis, "UTF-8");
         int charRead;
         int charCount = 0;
         while ((charRead = in.read()) != -1) {
            charCount++;
            System.out.printf("%c(%02X) ", (char)charRead, charRead);
         }
         System.out.println("\nNumber of characters read = " + charCount);
         in.close();
 
         // Byte-based (or stream-based) input
         fis = new FileInputStream("TestUTF8.txt");
         int byteRead;
         int byteCount = 0;
         while ((byteRead = fis.read()) != -1) {
            byteCount++;
            System.out.printf("%02X ", (byte)byteRead);
         }
         System.out.println("\nNumber of bytes read = " + byteCount);
         fis.close();
      } catch (FileNotFoundException ex) {
         ex.printStackTrace();
      } catch (UnsupportedEncodingException ex) {
         ex.printStackTrace();
      } catch (IOException ex) {
         ex.printStackTrace();
      }
   }
}
