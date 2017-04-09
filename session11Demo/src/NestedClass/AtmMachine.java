package NestedClass;

/**
 * Created by Monkey.TNT on 11/1/2016.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AtmMachine {
    static class BankDetails {
        static Calendar objNow = Calendar.getInstance();

        public static void printDetails() {
            System.out.println("State Bank of America");
            System.out.println("Branch:New York");
            System.out.println("Code:K3983LKSIE");
            System.out.println("Date-Time:" + objNow.getTime());
            SimpleDateFormat objFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            System.out.println("Date-Time:" + objFormat.format(objNow.getTime()));
        }
    }
    public void displayBalance(String accNo){
        System.out.println("Balance of account number " + accNo.toUpperCase() + " is $200000");
    }
}
class TestATM{
    public static void main(String[] args) {
        if (true){
            AtmMachine objAtm=new AtmMachine();
            AtmMachine.BankDetails.printDetails();
            objAtm.displayBalance("akdle26152");
        }else{
            System.out.println("Usage: java AtmMachine <account-no>");
        }
    }
}
