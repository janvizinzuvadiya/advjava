// assignment1 - 2...

package assignment1;
import java.sql.*;

public class subclass 
{
    static String insert(int id, String nm, int sal, String ds, String dp) 
    {
        String queryins="insert into Emp values (?,?,?,?,?)";
        try(Connection cn=Assignment1.getConnection();
            PreparedStatement pst=cn.prepareStatement(queryins);)
        {      
         
            pst.setInt(1, id);
            pst.setString(2, nm);
            pst.setInt(3,sal);
            pst.setString(4, ds);
            pst.setString(5, dp);
            
            int ansins=pst.executeUpdate();
            if(ansins >0)
            {
                return "your record is Inserted!";  
            }
            else
            {
                return "failed to insert your record!";
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            return e.getMessage();
        }
    }  
    
    static String update(int up,int id, String nm, int sal, String ds, String dp)
    {
        String queryupd="update Emp set emp_id=?, emp_name=?, salary=?, desig=?, department=? where emp_id=?";
        try(Connection cn=Assignment1.getConnection();
            PreparedStatement pst=cn.prepareStatement(queryupd);)
        {     
            pst.setInt(1, id);
            pst.setString(2, nm);
            pst.setInt(3,sal);
            pst.setString(4, ds);
            pst.setString(5, dp);
            pst.setInt(6, up);
            
            int ansupd=pst.executeUpdate();
            
            if(ansupd >0)
            {
                return "your record is Updated!";  
            }
            else
            {
                return "failed to Update your record!";
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            return e.getMessage();
        }
    }
    
    static String delete(int id)
    {
        String querydel="delete from Emp where emp_id=?";
        try(Connection cn=Assignment1.getConnection();PreparedStatement pst=cn.prepareCall(querydel);)
        {
            pst.setInt(1, id);
            
            int ansdel=pst.executeUpdate();         
            if(ansdel >0)
            {
                return "your record is Deleted!";  
            }
            else
            {
                return "failed to Delete your record!";
            }   
        }
        catch(Exception e)
        {
            System.out.println(e);
            return e.getMessage();
        }
    }

    static String search(int id) 
    {
        String queryser="select * from Emp where emp_id=?";
        try(Connection cn=Assignment1.getConnection();PreparedStatement pst=cn.prepareCall(queryser);)
        {
            pst.setInt(1, id);
            
            ResultSet rs=pst.executeQuery();         
            if(rs.next())
            {
                String ansser="Id: "+rs.getInt(1)+"\tName: "+rs.getString(2)+"\tSalary: "+rs.getInt(3)+
                              "\tDesig: "+rs.getString(4)+"\tDepartment: "+rs.getString(5);
                return ansser;  
            }
            else
            {
                return "failed to Search your record!";
            }   
        }
        catch(Exception e)
        {
            System.out.println(e);
            return e.getMessage();
        }
        
    }
}
