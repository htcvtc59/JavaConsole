import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> myList=new ArrayList<>();
        myList.add("Fpt");
        myList.add("Google");
        myList.add("Facebook");
        myList.add(1,"Apple");
        for (String s:myList
             ) {
            System.out.println(s);
        }
        System.out.println("");
       myList.forEach(x->{
           System.out.println(x);
        });
    }
}
