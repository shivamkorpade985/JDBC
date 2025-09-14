import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/spark";
        String username = "root";
        String password = "shivam";

        String createTableQuery = "CREATE TABLE  students(" +
                "id INT AUTO_INCREMENT PRIMARY KEY, " +
                "name VARCHAR(100), " +
                "age INT, " +
                "course VARCHAR(100) );";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            stmt.executeUpdate(createTableQuery);

            System.out.println("TABLE 'students' CREATED SUCCESSFULLY");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
