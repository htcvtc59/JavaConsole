/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package file;
import java.io.File;
import java.util.Arrays;

/**
 *
 * @author Duy Hoang
 */
public class Dir {
    static int indentLevel = -1;
    static void listPath(File path) {
	  // increase the Level of the Directory
        indentLevel++;
        File[] files = path.listFiles();
	  // Sort the file array
        Arrays.sort(files);
        for (int i = 0, n = files.length; i < n; i++) {
            for (int indent = 0; indent < indentLevel; indent++)
                System.out.print("  ");

            System.out.println(files[i].toString());
		// list the files of the files[i], that is a Directory
            if (files[i].isDirectory())
                listPath(files[i]);
        }
        // Return the Level of Parent Directory
        indentLevel--;
    }

    public static void main(String args[]) {
        listPath(new File("C:\\Users\\Monkey.TNT\\Desktop"));
    }

}
