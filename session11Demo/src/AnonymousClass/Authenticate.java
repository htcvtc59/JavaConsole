package AnonymousClass;

/**
 * Created by Monkey.TNT on 11/1/2016.
 */
public class Authenticate {
    Account objAcc=new Account(){
        @Override
        public void displayBalance(String accNo){
            System.out.println("Retrieving balance. Please wait...");
            System.out.println("Balance of account number  "+ accNo.toUpperCase() + " is $40000");
        }
    };
}
class Account{
    public void displayBalance(String accNo){

    }
}
class TestAuthentication{
    public static void main(String[] args) {
        Authenticate objUser=new Authenticate();
        if (true){
            if("admin".equals("admin")&&"abc@123".equals("abc@123")){
                objUser.objAcc.displayBalance("akdle26152");
            }else{
                System.out.println("Unauthorized user");
            }
        }else{
            System.out.println("Usage: java Authenticate <user-name> <password> <account-no>");
        }
    }
}