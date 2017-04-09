import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Monkey.TNT on 11/18/2016.
 */
public class VideoDownloader extends Thread{
    private URL url;
    private File targetFile;

    public void prepare(String url,String targetFile)throws MalformedURLException{
        this.url=new URL(url);
        this.targetFile=new File(targetFile);

    }

    @Override
    public void run() {
        try {
            FileUtils.copyURLToFile(url,targetFile);
            System.out.println("File successful");

        } catch (IOException e) {
            System.err.printf("Loi: "+e.getMessage());
        }
    }




}
