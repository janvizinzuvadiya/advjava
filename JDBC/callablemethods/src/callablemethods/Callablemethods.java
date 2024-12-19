package callablemethods;

//import java.io.BufferedReader;
//import java.io.InputStream;
//import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Callablemethods 
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException 
    {  
        Connection cn=null;
        CallableStatement cst=null;
//        BufferedReader read=null;
        Scanner sc=null;
        
        sc=new Scanner(System.in);
        cn=connectionfile.getconnection();
        cn.setAutoCommit(false);
        
        cst=cn.prepareCall("{CALL  getsalary(?,?)}");
        
        System.out.print("Enter id of Employee to get salary :");
        int id=sc.nextInt();
        
        cst.setInt(1, id);
        cst.registerOutParameter(2, java.sql.Types.DOUBLE);
        
        cst.execute();
        
        double  sal=cst.getDouble(2);
        System.out.println("salary:"+sal);       
        
    }
    
}
