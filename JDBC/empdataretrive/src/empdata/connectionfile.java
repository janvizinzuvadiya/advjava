package empdata;
import java.sql.*;

public class connectionfile 
{
        public  static Connection connectdb() 
        {
                        String url="jdbc:mysql://localhost:3306/stud";
                        String user="root";
                        String pass="1234";

                                    try 
                                    {
                                        // Load Driver
                                        Class.forName("com.mysql.jdbc.Driver");
                                        System.out.println("Drivers Loaded Successfully!!");

                                         //create connection object
                                        Connection cn=DriverManager.getConnection(url,user,pass);
                                        System.out.println("Connection Established Successfully!!");
                                        
                                         return cn;
                                    } 
                                    catch (ClassNotFoundException ex) 
                                    {
                                          System.out.println(ex.getMessage());
                                    }
                                    catch(SQLException ex)
                                    {
                                        System.out.println(ex.getMessage());
                                    }          
                                     return null;                             
                                   
            }
}

