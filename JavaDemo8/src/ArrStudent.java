import java.util.ArrayList;

/**
 * Created by Monkey.TNT on 10/24/2016.
 */
public class ArrStudent {
    public static void main(String[] args) {
        ArrayList<Student> myList=new ArrayList<>();
        myList.add(new Student("Ham"));
        myList.add(new Student("Ronaldo"));
        myList.add(new Student("Ham"));
        myList.add(new Student("Ham"));
        myList.add(new Student("Ham"));
        myList.add(new Student("Ham"));
        Student st=new Student("Ronaldo");
        boolean value=myList.contains(st);
        System.out.println(value);
    }
}
