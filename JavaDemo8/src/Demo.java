import java.util.ArrayList;

/**
 * Created by Monkey.TNT on 10/24/2016.
 */
public class Demo {
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Fpt");
        myList.add("Google");
        myList.add("Facebook");
        myList.add("Apple");
        myList.remove(1);
//        myList.remove("Fpt");
        boolean value = myList.contains("fpt");
        System.out.println(value);
//        myList.remove(new Integer(4));
//        myList.clear();
        for (String s : myList
                ) {
            System.out.println(s);
        }
    }


}
