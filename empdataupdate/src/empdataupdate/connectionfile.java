package empdataupdate;
import java.sql.*;

public class connectionfile 
{
        public static String url="jdbc:mysql://localhost:3306/stud";
        public static String user="root";
        public static String pass="1234";
        
        public static Connection connectdb()
        {
                        try
                        {
                              Class.forName("com.mysql.jdbc.Driver");
                               System.out.println("Driver Loaded!!");

                               Connection cn=DriverManager.getConnection(url,user,pass);
                               System.out.println("Connection Established!!");

                                return cn;
                        }
                        catch(ClassNotFoundException e)
                        {
                                    System.out.println(e);
                                    return null;
                        }
                        catch(SQLException e)
                        {
                                    System.out.println(e);
                                    return null;
                        }
        }
    
}
