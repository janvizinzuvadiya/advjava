package callablemethods;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

public class connectionfile 
{
    //constructor
    public connectionfile()
    {
        System.out.println("Connecting to Database!!...");
    }
    
    //private connection varibales
    private static final String url="jdbc:mysql://localhost:3306/stud";
    private static final String user="root";
    private static final String pass="1234";
    
    //method to get connection
    public static Connection getconnection () throws SQLException, ClassNotFoundException
    {           
                      Class.forName("com.mysql.cj.jdbc.Driver");
                       System.out.println("Driver Loaded!!");

                       Connection cn=DriverManager.getConnection(url,user,pass);
                       System.out.println("Connection Established Successfully!!\n");

                        return cn;  
    }
}
