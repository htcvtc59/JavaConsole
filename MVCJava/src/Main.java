import Controller.CustomerController;
import Model.CustomerDAO;
import View.CustomerView;


/**
 * Created by Monkey.TNT on 11/21/2016.
 */
public class Main {
    public static void main(String[] args) {
        CustomerController customerController=new CustomerController();
        CustomerDAO model=new CustomerDAO();
        CustomerView view=new CustomerView();
        customerController.setModel(model);
        customerController.setView(view);
        customerController.start();
    }

}
