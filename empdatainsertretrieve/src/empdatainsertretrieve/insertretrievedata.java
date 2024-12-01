package empdatainsertretrieve;
import java.sql.*;

public class insertretrievedata {

    public static String query="insert into emp values(9, 'hunny', 'house wife',700 00.0)";
            
    public static void main(String[] args) 
    {
        try(Connection cn=connectionfile.connectdb())
        {
            Statement st=cn.createStatement();
            int affectedrows=st.executeUpdate(query);
            
            if(affectedrows>=1)
            {
                System.out.println(affectedrows+" Row has Inserted Successfully!!\n");
                
                ResultSet rs=st.executeQuery("select * from emp");
               
                System.out.println("+-------+----------------------+----------------------+-----------+");
                System.out.printf("| %-5s | %-20s | %-20s |%-10s |\n","Id","Name","Job_Title","Salary");
                System.out.println("+-------+----------------------+----------------------+-----------+");
                
                while(rs.next())
                {
                        int id=rs.getInt(1);
                       String name=rs.getString(2);
                       String job=rs.getString(3);
                       double sal=rs.getDouble(4);
                       
                        System.out.printf("| %-5d | %-20s | %-20s |%-10.2f |\n",id,name,job,sal);           
                }
                System.out.println("+-------+----------------------+----------------------+------------+");
            }
            else
                System.out.println("Insertion Failed!!");
            
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
