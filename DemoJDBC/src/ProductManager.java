
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Monkey.TNT on 11/14/2016.
 */
public class ProductManager {

    private Connection con;

    public ProductManager()throws ClassNotFoundException,SQLException {
        openConnection();
    }

    public void close()throws SQLException{
        con.close();
    }
    private void openConnection() throws ClassNotFoundException,SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//        2nd Tao ket noi
        String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=news";
        String user = "sa";
        String password = "230697";
        con = DriverManager.getConnection(url, user, password);
    }


    public List<Product> getAll() throws  SQLException {
        List<Product> data = new ArrayList<>();
        Statement stm = con.createStatement();
        ResultSet rs = stm.executeQuery("select * from product");
        while (rs.next()) {
            Product p = new Product();
            p.id = rs.getInt("id");
            p.name = rs.getString("name");
            p.price = rs.getFloat("price");
            data.add(p);
        }
        return data;
    }

    public boolean delete(int id)throws SQLException {
        //        TODO input code here
        Statement stmt = con.createStatement();
        String sql = "delete from product where id = '" + id + "' ";
        System.out.println(sql);
        int result = stmt.executeUpdate(sql);
        System.out.println("Deleted: " + result);
        return true;
    }

    public boolean update(int id, Product p) throws SQLException {
        //        TODO input code here
        Statement stmt = con.createStatement();
        String sql = " update product set name = '" + p.getName() + "' , price = '" + p.getPrice() + "' where id = '" + id + "' ";
        System.out.println(sql);
        int result = stmt.executeUpdate(sql);
        System.out.println("Updated: " + result);


        return true;
    }

    public boolean create(Product p) throws  SQLException {
        //        TODO input code here

        Statement stmt = con.createStatement();
        String sql = "insert into product values('" + p.getId() + "','" + p.getName() + "','" + p.getPrice() + "')";
        System.out.println(sql);
        int result = stmt.executeUpdate(sql);
        System.out.println("Inserted: " + result);
        ;
        return true;
    }

    public List<Product>search(String name)throws SQLException {
        List<Product> data = new ArrayList<>();

        Statement stm = con.createStatement();
        String sql = "select * from product where name like '%"+name+"%' " ;
        System.out.println(sql);
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            Product p = new Product();
            p.id = rs.getInt("id");
            p.name= rs.getString(2);
            p.price = rs.getFloat("price");
            data.add(p);
        }
        return data;
    }


    public boolean insert(Product p)throws SQLException{
        String sql =" insert into product(id,name,price) values(?,?,?)";
        PreparedStatement stmt= con.prepareStatement(sql);
        stmt.setInt(1,p.getId());
        stmt.setString(2,p.getName());
        stmt.setFloat(3,p.getPrice());
        stmt.executeUpdate();
        return true;
    }
}
