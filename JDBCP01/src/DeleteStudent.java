import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteStudent{
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/spark";
        String username = "root";
        String password = "shivam";

        String deleteQuery = "delete from students where id = ? ";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement pr = con.prepareStatement(deleteQuery);
            pr.setInt(1,2);

    int update = pr.executeUpdate();
            if (update>0)
                System.out.println("Data deleted");
            else
                System.out.println("Data not found");

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}