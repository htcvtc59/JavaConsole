/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package file;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Duy Hoang
 */
public class FileDescriptorDemo {
     /** Creates a new instance of FileDescriptorDemo */
    public FileDescriptorDemo() {
    }

    public static void main(String[] a) {
        File aFile = new File("C:\\Users\\Monkey.TNT\\Desktop\\myFile.txt");
        FileInputStream inputFile1 = null;
        FileDescriptor fd = null;

        try {
            inputFile1 = new FileInputStream(aFile);
            fd = inputFile1.getFD();
        } catch (IOException e) {
            e.printStackTrace(System.err);
            System.exit(1);
        }

        FileInputStream inputFile2 = new FileInputStream(fd);
        try {
            FileOutputStream fo = new FileOutputStream(aFile, true);
            String s = "the world is not enough";
            for (int i = 0; i < s.length(); i++) {
                fo.write((int) s.charAt(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
