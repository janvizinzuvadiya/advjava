// assignment1 - 2

package assignment1;
import java.sql.*;
import java.util.*;

public class assignment102 
{
    public static void main(String [] args)
    { 
        Connection cn;
        Statement st;
        ResultSet rs;
        Scanner sc; 
        int id,sal,up;
        String nm,ds,dp,ans;
        
        sc=new Scanner(System.in);
        int i;
        
        System.out.println("What do you want to do?");
        System.out.println("1.Insert Record");
        System.out.println("2.Update Record");
        System.out.println("3.delete Record");
        System.out.println("4.Search Record");

        System.out.print("Enter your no of choice=>");
        i=sc.nextInt();
        
        switch(i)
        {
            case 1:
                System.out.println("Enter details to insert!");
                System.out.print("Id:");
                id=sc.nextInt();
                System.out.print("Name:");
                nm=sc.next();
                System.out.print("Salary:");
                sal=sc.nextInt();
                System.out.print("Design:");
                ds=sc.next();
                System.out.print("Department:");
                dp=sc.next();

                ans=subclass.insert(id,nm,sal,ds,dp);
                System.out.println(ans);
                break;
                 
            case 2:
                System.out.println("Enter details to update!");
                 System.out.print("please give the id of the record which you want to update:");
                 up=sc.nextInt();    
                System.out.print("Id:");
                id=sc.nextInt();
                System.out.print("Name:");
                nm=sc.next();
                System.out.print("Salary:");
                sal=sc.nextInt();
                System.out.print("Design:");
                ds=sc.next();
                System.out.print("Department:");
                dp=sc.next();

                ans=subclass.update(up,id,nm,sal,ds,dp);
                System.out.println(ans);
                break;
                
            case 3:
                System.out.println("Enter details to Delete Record!");
                System.out.print("Id:");
                id=sc.nextInt();
                
                ans=subclass.delete(id);
                System.out.println(ans);
                break;
                
            case 4:
                System.out.println("Enter details to Search Record!");
                System.out.print("Id:");
                id=sc.nextInt();
                
                ans=subclass.search(id);
                System.out.println(ans);
                break;
                
            default:
                System.out.println("Invalid choice.");
                break;
        }   
    }   
}
