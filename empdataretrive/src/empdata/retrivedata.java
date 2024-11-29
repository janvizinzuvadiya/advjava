package empdata;
import java.sql.*;

public class retrivedata
{
    public static void main(String[] args) 
    {
               String query="select * from emp";

                    try(Connection cn=connectionfile.connectdb();)
                    {   
                                  //create Statement Object and Resultset
                                  Statement st=cn.createStatement();
                                  ResultSet rs= st.executeQuery(query);

                                  System.out.println("+-------+----------------------+----------------------+------------+");
                                  System.out.printf("| %-5s | %-20s | %-20s | %-10s |\n", "ID", "Name", "Job Title", "Salary");
                                  System.out.println("+-------+----------------------+----------------------+------------+");
                                  
                                  while(rs.next())
                                  {
                                          int id=rs.getInt(1);
                                          String name=rs.getString(2);
                                          String job_title=rs.getString(3);
                                          double salary=rs.getDouble(4);
                                          
                                          System.out.printf("| %-5d | %-20s | %-20s | %-10.2f |\n", id, name, job_title, salary);
                                  }

                                  System.out.println("+-------+----------------------+----------------------+------------+");
                                  
                                  
                                  rs.close();
                                  st.close();
                                  cn.close();

                    }
                    catch(SQLException e)
                    {
                        System.out.println(e.getMessage());
                    }      
              
    }
    
}
