public class Tester {
    public static void main(String[] args) {
        int sum = 0;
        final int grace = 20;
        try {
            for (int i = 0; i < 5; i++) {
//                if (i == 0) {
                    sum = sum + i;
//                }
//                System.out.println(i);
//                if(i==3||i==4||i==5){
//                sum = sum + Integer.parseInt(args[i]);
//                }
            }
            int perGrace = grace * 100 / sum;
            System.out.println("Sum is:" + sum);
            System.out.println("Percentage grace is:" + perGrace);
        } catch (ArithmeticException ex) {
            System.out.println("Division by zero");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Unreachable array index");
        } catch (Exception ex) {
            System.out.println("Error in code");
        }

    }
}
