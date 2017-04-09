package View;

import java.util.Scanner;

/**
 * Created by Monkey.TNT on 11/21/2016.
 */
public class CustomerView {
    private Scanner sc= new Scanner(System.in);
    public String inputUsername(){
        System.out.println("Moi ban nhap username: ");
        return sc.nextLine();
    }
    public String inputPassword(){
        System.out.println("Moi ban nhap password: ");
        return sc.nextLine();
    }
    public void success(String message){
        System.out.println(message);
    }
    public void error(String message){
        System.err.println(message);
    }
}
