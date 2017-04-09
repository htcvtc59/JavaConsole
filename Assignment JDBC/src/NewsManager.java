
import java.sql.*;
import java.util.ArrayList;

public class NewsManager {
    public Connection conn = null;
    public PreparedStatement pstmt = null;
    public ResultSet rs = null;

    public Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=News";
            conn = DriverManager.getConnection(url, "sa", "230697");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public void closeConnect() {
        try {
            if (conn != null) {
                conn.close();
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public ArrayList<News> getAllNews() {
        ArrayList<News> newsArrayList = new ArrayList<>();
        try {
            getConnection();
            pstmt = conn.prepareStatement("select * from New");
            rs = pstmt.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    News news = new News();
                    news.setId(rs.getInt("Id"));
                    news.setName(rs.getString("Name"));
                    news.setDate(rs.getString("Date"));
                    news.setTitle(rs.getString("Title"));
                    news.setDescription(rs.getString("Description"));
                    news.setDetails(rs.getString("Details"));
                    news.setCategory(rs.getString("Category"));
                    news.setImage(rs.getString("Image"));
                    newsArrayList.add(news);
                }
            }
            closeConnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return newsArrayList;
    }


    public ArrayList<News> getOneNews(int id) {
        ArrayList<News> newsArrayList = new ArrayList<>();


        try {
            getConnection();
            pstmt = conn.prepareStatement("select * from New where Id =?");
            pstmt.setInt(1, id);
            rs = pstmt.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    News news = new News();
                    news.setId(rs.getInt("Id"));
                    news.setName(rs.getString("Name"));
                    news.setDate(rs.getString("Date"));
                    news.setTitle(rs.getString("Title"));
                    news.setDescription(rs.getString("Description"));
                    news.setDetails(rs.getString("Details"));
                    news.setCategory(rs.getString("Category"));
                    news.setImage(rs.getString("Image"));
                    newsArrayList.add(news);
                }
            }
            closeConnect();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return newsArrayList;
    }


    public void InsertNews(News news) {
        try {
            getConnection();
            pstmt = conn.prepareStatement("insert into New(Id,Name,Date,Title,Description,Details,Category,Image) VALUES(?,?,?,?,?,?,?,?)");
            pstmt.setInt(1, news.getId());
            pstmt.setString(2, news.getName());
            pstmt.setString(3, news.getDate());
            pstmt.setString(4, news.getTitle());
            pstmt.setString(5, news.getDescription());
            pstmt.setString(6, news.getDetails());
            pstmt.setString(7, news.getCategory());
            pstmt.setString(8, news.getImage());
            int result = pstmt.executeUpdate();
            System.out.println("Inserted: " + result);
            closeConnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void DeletetNews(int id) {
        try {
            getConnection();
            pstmt = conn.prepareStatement("delete from New where Id = ?");
            pstmt.setInt(1, id);
            int result = pstmt.executeUpdate();
            System.out.println("Deleted: " + result);
            closeConnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
