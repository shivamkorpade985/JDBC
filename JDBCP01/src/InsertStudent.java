import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertStudent {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/spark";
        String username = "root";
        String password = "shivam";

        String insertQuery = "insert into students(name,age,course) values(?,?,?)";
        Scanner sc = new Scanner(System.in);
        try {
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement pr = con.prepareStatement(insertQuery);
            System.out.println("Enter name:");
            String name1 = sc.next();
            pr.setString(1,name1);

            System.out.println("Enter age:");
            int age = sc.nextInt();
            pr.setInt(2,age);


            System.out.println("Enter course");
            String course = sc.next();
            pr.setString(3,course);



            System.out.println("DATA INSERTED");

            pr.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
