import java.sql.*;

public class FetchStudent {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/spark";
        String username = "root";
        String password = "shivam";

        String query = "select * from students";
             Connection con = null;
        try{
            //load driver
            //Class.forName("com.mysql.cj.jdbc.Driver");  //Note after JDBC 4.0 and java 1.8 doesn't explicitly need to load a driver
            //create connection
             con = DriverManager.getConnection(url,username,password);
             //create statement
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("Id | Name | Age | Course");
            System.out.println("-------------------------");
            while (rs.next()){
                System.out.println(rs.getInt("id")+" | "+ rs.getString("name")+" | "+
                        rs.getInt("age")+" | "+rs.getString("course")+" | ");
            }
        } catch (Exception e) {
                           e.printStackTrace();
        }
        finally {
            con.close();
        }

    }
}
