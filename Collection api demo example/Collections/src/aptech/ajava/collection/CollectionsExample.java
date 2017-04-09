/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aptech.ajava.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author cibervn
 */
public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add("1");
        array.add("mot");
        array.add("one");
        array.add("uno");
        array.add("unno");
        array.add("a");

        Collections.sort(array, new Comparator() {

            public int compare(Object o1, Object o2) {
                String s1= o1.toString();
                String s2= o2.toString();
                return s1.compareTo(s2);
            }
        });

        for (int i = 0; i < array.size(); i++) {
            Object object = array.get(i);
            System.out.println(object);
        }
        

    }
}
