import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/spark";
        String username = "root";
        String password = "shivam";

        String updateQuery = "update students set name = ? ,age = ? ,course = ? where id = ?";

        try{
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement pr = con.prepareStatement(updateQuery);

            pr.setString(1,"Samrat");
            pr.setInt(2,20);
            pr.setString(3,"DSA");
            pr.setInt(4,1);

            pr.executeUpdate();

            System.out.println("Data updated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
