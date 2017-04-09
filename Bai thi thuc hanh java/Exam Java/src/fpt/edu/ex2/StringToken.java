package fpt.edu.ex2;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 * Created by Monkey.TNT on 11/2/2016.
 */
public class StringToken {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String fpt = sc.nextLine();
        StringTokenizer st=new StringTokenizer(fpt," ");
        System.out.print("Result: ");
        System.out.println();
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
