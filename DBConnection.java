import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/travel_portal";
    private static final String USER = "root"; // change if different
    private static final String PASSWORD = "root123"; // change to your MySQL password

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Database Connected Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
