import java.util.ArrayList;

/**
 * Created by Monkey.TNT on 10/28/2016.
 */
public class Freezer {
    ArrayList<Animal>animalArrayList = new ArrayList<>();
    public void display(){
        for (Animal a:animalArrayList)a.run();

    }
    public void add(Animal a){
        animalArrayList.add(a);
    }
}
