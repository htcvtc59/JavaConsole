package Model;

import java.sql.*;

/**
 * Created by Monkey.TNT on 11/21/2016.
 */
public class CustomerDAO {
    private PreparedStatement getSQLStatement(String sql) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=demo_mvc";
        Connection conn = DriverManager.getConnection(url, "sa", "230697");
        return conn.prepareStatement(sql);
    }

    public Customer login(String username, String password) throws SQLException, ClassNotFoundException {
        Customer customer = null;
        String sql = "select top 1 * from customer where username = ? and password = ?";
        PreparedStatement pstmt = getSQLStatement(sql);
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            customer = new Customer();
            customer.fullname = rs.getString("fullname");
            customer.username = username;
            customer.password = password;
        }
        pstmt.getConnection().close();
        return customer;
    }




}
