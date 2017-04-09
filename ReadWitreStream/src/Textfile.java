import java.io.*;

/**
 * Created by Monkey.TNT on 11/11/2016.
 */
public class Textfile {
    public static String readFileNormal(File file) throws IOException {
        String result = "";
        FileInputStream in = new FileInputStream(file);
        int i;
        while ((i = in.read()) != -1) {
            result += (char) i;
        }
        in.close();
        return result;
    }

    public static void writeFileNormal(String content, File outFile) throws IOException {
        FileOutputStream out = new FileOutputStream(outFile);
        try {
            out.write(content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.close();
    }

    public static String readFileUserinhDataReader(File infile) {
        Reader reader = new FileReader(infile);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String result=" ";
        String s;
            while ((s = bufferedReader.readLine()) != null) {
                result += s + "\n";
            }
        bufferedReader.close();
        reader.close();
        return result;

    }
}
