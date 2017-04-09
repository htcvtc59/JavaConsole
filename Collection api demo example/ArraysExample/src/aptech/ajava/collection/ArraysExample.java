/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aptech.ajava.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author cibervn
 */
public class ArraysExample {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        array.add("1");
        array.add("mot");
        array.add("one");
        array.add("uno");
        array.add("unno");
        array.add("a");

        Object arr[] = array.toArray();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            Object object = arr[i];
            System.out.println(object);
        }
        

    }
}
