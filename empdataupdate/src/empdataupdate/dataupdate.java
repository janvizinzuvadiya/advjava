
package empdataupdate;
import java.sql.*;


public class dataupdate {

   public static String query="update emp set name='jayni' where id=8";
    
    public static void main(String[] args) {
   
      
       
        try(Connection cn=connectionfile.connectdb())
        {
                    Statement st=cn.createStatement();
                    int affectedrows=st.executeUpdate(query);

                    if(affectedrows>0)
                    {
                                System.out.println(affectedrows+" Row has Updated!! ");

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
                        {
                                System.out.println("Failed to Update!!");
                        }

          }
        catch(Exception e)
        {
            System.out.println(e);
        }

        
        
        
        
    }
    
}
