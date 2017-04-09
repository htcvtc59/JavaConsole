/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aptech.ajava.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author cibervn
 */
public class DemoMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");

        Set keySet  = map.keySet();
        for (Object object : keySet) {
            Object obj = map.get(object);
            System.out.println(obj);
        }
    }
}
