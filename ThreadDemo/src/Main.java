import java.net.MalformedURLException;

/**
 * Created by Monkey.TNT on 11/18/2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException, MalformedURLException{
        String url = "http://www.sample-videos.com/video/mp4/240/big_buck_bunny_240p_1mb.mp4";
        String file = "C:\\Users\\Monkey.TNT\\Downloads\\video.mp4";
        VideoDownloader downloader = new VideoDownloader();
        downloader.prepare(url, file);
        downloader.start();
//        Video down = new Video();
//        down.prepare(url,file);
//        Thread t = new Thread(down);
//        t.start();
    }
}
