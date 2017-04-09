package Controller;

import Model.Customer;
import Model.CustomerDAO;
import View.CustomerView;

import java.sql.SQLException;

/**
 * Created by Monkey.TNT on 11/21/2016.
 */
public class CustomerController {
    private CustomerDAO customerDAO;
    private CustomerView customerView;

    public void setModel(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    public void setView(CustomerView customerView) {
        this.customerView = customerView;
    }

    public void start() {
        String user = customerView.inputUsername();
        String pass = customerView.inputPassword();

        try {
            Customer login = customerDAO.login(user, pass);
            if(login != null){
                customerView.success("Dang nhap thanh cong");
                customerView.success("Chao mung "+login.fullname);
            }else{
                customerView.error("Dang nhap that bai");
            }


        }catch (ClassNotFoundException|SQLException ex){
            customerView.error(ex.getMessage());
        }

    }
}
