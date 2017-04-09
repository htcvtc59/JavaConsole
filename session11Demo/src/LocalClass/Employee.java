package LocalClass;

/**
 * Created by Monkey.TNT on 11/1/2016.
 */
public class Employee {
    public void evaluateStatus(String empID,int empAge){
        final int age=40;
        class Rank{
            public char getRank(String empID){
                System.out.println("Getting Rank of employee: "+empID);
                return 'A';
            }
        }
        if (empAge>=age){
            Rank objRank =new Rank();
            char rank = objRank.getRank(empID);
            if (rank=='A'){
                System.out.println("Employee rank is: "+rank);
                System.out.println("Status: Eligible for upgrade");
            }else{
                System.out.println("Status: Not Eligible for upgrade");
            }
        }else{
            System.out.println("Status: Not Eligible for upgrade");
        }
    }
}
class TestEmployee{
    public static void main(String[] args) {
        if(true){
            Employee objEmp1= new Employee();
            objEmp1.evaluateStatus("E001",Integer.parseInt("40"));
        }else{
            System.out.println("Usage: java Employee <Emp-Id> <Age>");
        }
    }
}
