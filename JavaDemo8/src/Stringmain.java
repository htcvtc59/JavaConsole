/**
 * Created by Monkey.TNT on 10/26/2016.
 */
public class Stringmain {

    public static void main(String[] args) {
        String str1 = "Fpt Aptech";
        String str2 = "Fpt Aptech";
        int a=1000;
        String value = a+"";
        String valueOf=String.valueOf(a);
        Float.parseFloat(a+"");

        System.out.println("KQ: "+str1.endsWith("ch"));
        System.out.println("KQ: "+str1.startsWith("FT"));
        System.out.println("KQ: "+str1.contains("Ap"));
        System.out.println("KQ: "+(str1.equals(str2)));
        System.out.println(value);
        System.out.println(valueOf);
        String str = "FPT University FPT Aptech FPT Academy";
        int c=0;
        while (str.contains("FPT")){
            c++;
            str=str.replaceFirst("FPT","");
        }
        System.out.println("Count: "+c);

    }
}
