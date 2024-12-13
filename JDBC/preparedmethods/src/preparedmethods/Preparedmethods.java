package preparedmethods;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Preparedmethods 
{

    public static void main(String[] args)
    {
        Connection cn=null;
        PreparedStatement pst=null;
        BufferedReader read=null;
        Scanner sc=null;
        
        try
        {
            String nm;
            String job;
            double sal;
            String ch;
            int id;
            
            cn=connectionfile.getconnection();
            cn.setAutoCommit(false);
            String query="INSERT INTO emp (id,name,job_title,salary) VALUES (?,?,?,?) ";
            pst=cn.prepareStatement(query);
            read=new BufferedReader(new InputStreamReader(System.in));
            sc=new Scanner(System.in);
                while(true)
                {
                    System.out.print("\nEnter id:");
                    id=sc.nextInt();
                    System.out.print("Enter Name:");
                    nm=read.readLine();
                    System.out.print("Enter Job_Title:");
                    job=read.readLine();
                    System.out.print("Enter Salary:");
                    sal=Double.parseDouble(read.readLine());
                    
                    pst.setInt(1, id);
                    pst.setString(2, nm);
                    pst.setString(3, job);
                    pst.setDouble(4, sal);
                    
                    pst.addBatch();
                    
                    System.out.print("\nAdd More Y/N?:");
                    ch=sc.next();
                    
                    if(ch.toUpperCase().equals("N"))
                    {
                        break;
                    }
                }
                
               int res[]= pst.executeBatch();
               System.out.println("Inserted"+res.toString());
               cn.commit(); 
               
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                    if( cn != null)
                        cn.close(); 
                    if(pst != null)
                        pst.close();
                    if(sc != null)
                        sc.close();
                    if(read != null)
                        read.close();
                    
                    System.out.println("Connection Close: "+cn.isClosed());
                    System.out.println("PreparedStatement Close: "+pst.isClosed());                    
            }
            catch(Exception e)
            {
                System.out.println(e.getStackTrace());
            }
        }        
    }   
}
