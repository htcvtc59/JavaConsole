import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Monkey.TNT on 11/9/2016.
 */
public class Mapapi {
    public static void main(String[] args) {
        Map<String,String> map = new TreeMap<>();
        map.put("apple","Apple.inc");
        map.put("google","Google.inc");
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("k :" + entry.getKey() + "v: "+entry.getValue());
        }
    }
}
