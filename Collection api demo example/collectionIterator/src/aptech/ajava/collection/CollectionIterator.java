/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aptech.ajava.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author cibervn
 */
public class CollectionIterator {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("1");
        collection.add("mot");
        collection.add("one");
        collection.add("uno");
        collection.add("unno");
        collection.add("a");

        Iterator iterator =collection.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }

    }
}
