    // assignment1 - 1

package assignment1;
import java.sql.*;
public class assignment101 
{
    public static void main(String [] args)
    {
        Statement st;
        ResultSet rs;
        int id,sal;
        String nm,ds,dp;
        
        try(Connection cn=Assignment1.getConnection();)
        {           
           st=cn.createStatement();
           rs=st.executeQuery("select * from Emp");
           
           while(rs.next())
           {
               id=rs.getInt(1);
               nm=rs.getString(2);
               sal=rs.getInt(3);
               ds=rs.getString(4);
               dp=rs.getString(5);
               
               System.out.println("Id: "+id+"\tName: "+nm+"\tSalary: "+sal+"\tDesig: "+ds+"\tDepartment: "+dp);
           }
           cn.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());     
        } 
    }
    
}
