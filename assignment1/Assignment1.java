// assignment1 ...

package assignment1;
import java.sql.*;

public class Assignment1 
{
    private static final String url = "jdbc:mysql://localhost:3335/java";
    private static final String user = "root";
    private static final String pwd = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, pwd);
    }
}
       
        
           