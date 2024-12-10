package statementmethods;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Scanner;

public class Statementmethods 
{
    private static Connection cn;
    private static Statement st;
    static Scanner sc;
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {      
                try
                {
                    cn=connectionfile.getconnection();
                    st=cn.createStatement();
                    int choice;
                    sc=new Scanner(System.in);
                    
                    do
                    {              
                        System.out.println("\n\nWhich Method You want to Run?");
                        System.out.println("1] create table\n2] insert record\n3] update record\n4]delete record\n5] batch process\n6]selectdata using  execute\n7] Exit\n");
                        
                        System.out.print("Enter the Index:");
                        choice=sc.nextInt();
      
                        switch(choice)
                        {
                            case 1:                         
                                createtable(cn);
                                break;
                               
                            case 2:     
                                insertdata(cn);  
                                break;

                            case 3:
                                updatedata(cn);
                                break;

                            case 4:
                                deletedata(cn);  
                                break;
    
                            case 5:
                                batchprs(cn);
                                break;
                                
                            case 6:
                                selectdata_execute(cn);
                                break;
                                
                            case 7:
                                System.out.println("Closing the Menu...");
                                break;
                                
                            default:
                                System.out.println("Not the Method !!");
                                break;
                        }

                            }while(choice!=7);
                }
                catch(Exception e) {     System.out.println(e);        }
                finally                       {        closeResources();       }
            }
    
    private static void createtable(Connection cn) throws SQLException
    {
               System.out.println("\nCreate table Method!");
                String query="CREATE TABLE student ("
                                        +"id int,"
                                        +"name varchar(20),"
                                        +"age int)";


                // execute(String sql) Executes a given SQL statement, 
                // which can be a query, update, or any SQL command. Returns a boolean: true if the result is a ResultSet.
                boolean ans=st.execute(query);           
                System.out.println(ans+"\n");
    }

    private static void insertdata(Connection cn) throws SQLException 
    {
        System.out.println("\nInsert Records Method!");
        String query="INSERT INTO student VALUES (01,'harry',22)";
        
//        executeUpdate(String sql)Executes the given SQL statement
//        for INSERT, UPDATE, or DELETE queries. Returns the number of rows affected.
        
        int affectedrows=st.executeUpdate(query);
       if (affectedrows>0)
       {
            System.out.println(affectedrows+" row inserted !");
            selectdata_executequery(cn);
       }
       else
            System.out.println("Failed to Insert! ");
        
    }

    private static void updatedata(Connection cn) throws SQLException 
    {
        System.out.println("\nUpdate Records Method!");
        String query="UPDATE student SET name='harry potter' WHERE id=1";
        
//       getUpdateCount()	
//        Retrieves the number of rows affected by the last query executed by execute(String sql). 
       
        st.execute(query);
       int affectedrows = st.getUpdateCount();
            
       if (affectedrows>0)
       {
           System.out.println("Rows updated: " + affectedrows);
           selectdata_executequery(cn);
       }
       else
            System.out.println("Failed to Update! ");
         
    }

    private static void deletedata(Connection cn) throws SQLException 
    {
        System.out.println("\nDelete Records Method!");
        String query="DELETE FROM student WHERE id=1";
        
//        executeUpdate(String sql)Executes the given SQL statement
//        for INSERT, UPDATE, or DELETE queries. Returns the number of rows affected.
        
        int affectedrows=st.executeUpdate(query);
       if (affectedrows>0)
       {
            System.out.println(affectedrows+" row deleted !");
            selectdata_executequery(cn);
       }
       else
            System.out.println("Failed to Delete! ");
      
    }

    private static void batchprs(Connection cn) throws SQLException 
    {
        System.out.println("\nBatch Process Method!");
//        addBatch(String sql)
//        Adds the given SQL statement to the batch of commands for execution.

//        clearBatch()	
//        Clears the current batch of commands for the Statement.

          st.addBatch("SELETE FROM student WHERE id=1;");
          st.clearBatch();
        
          st.addBatch("INSERT INTO student VALUES (1,'harry potter',25)");  
          st.addBatch("UPDATE student SET age=30 WHERE id=1");

//          executeBatch()	
//          Executes the batch of commands added using addBatch. Returns an array of update counts.
          
           int[] results = st.executeBatch();
           System.out.println("Batch executed. Rows affected: " + Arrays.toString(results));
  
           selectdata_executequery(cn);
    }
    
       private static void selectdata_executequery(Connection cn) throws SQLException 
    {
//        executeQuery(String sql)	
//        Executes the given SQL query, which returns a single ResultSet object (for SELECT statements).
        
        String query = "SELECT id, name, age FROM student";
        ResultSet rs = st.executeQuery(query);

        System.out.println("Database:stud  /  Table:student");
        
            System.out.println("+----+----------------------+-----+");
            System.out.printf("| %-2s | %-20s | %-3s |\n", "ID", "Name", "Age");
            System.out.println("+----+----------------------+-----+");
           
            while (rs.next()) 
            {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);

                System.out.printf("| %-2d | %-20s | %-3d |\n", id, name, age);
            }

            System.out.println("+----+----------------------+-----+");
              
    }

    private static void selectdata_execute(Connection cn) throws SQLException 
    {     
        boolean isResultSet = st.execute("SELECT * FROM student");

            if (isResultSet) 
            {
                        ResultSet rs = st.getResultSet();

                         System.out.println("Database:stud  /  Table:student");

                        System.out.println("+----+----------------------+-----+");
                        System.out.printf("| %-2s | %-20s | %-3s |\n", "ID", "Name", "Age");
                        System.out.println("+----+----------------------+-----+");

                        while (rs.next()) 
                        {
                                    int id = rs.getInt(1);
                                    String name = rs.getString(2);
                                    int age = rs.getInt(3);

                                    System.out.printf("| %-2d | %-20s | %-3d |\n", id, name, age);   
                        }
                        System.out.println("+----+----------------------+-----+");     
                        rs.close();
            } 
            else 
            {
                        int rowsAffected = st.getUpdateCount();
                        System.out.println("Rows affected: " + rowsAffected);
            }      
            
              setgetmaxrow(); 
    }

    private static void setgetmaxrow() throws SQLException
    {
        //setMaxRows(int max)	
//        Sets the maximum number of rows that a ResultSet can contain.
        
         System.out.println("\nsetting max rows 3");
         st.setMaxRows(3);  
        
         String query = "SELECT id, name, age FROM student";
        ResultSet rs = st.executeQuery(query);

        System.out.println("Database:stud  /  Table:student");
        
            System.out.println("+----+----------------------+-----+");
            System.out.printf("| %-2s | %-20s | %-3s |\n", "ID", "Name", "Age");
            System.out.println("+----+----------------------+-----+");
           
            while (rs.next()) 
            {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);

                System.out.printf("| %-2d | %-20s | %-3d |\n", id, name, age);
            }

            System.out.println("+----+----------------------+-----+");     
            
//            getMaxRows()
//            Retrieves the maximum number of rows allowed for a ResultSet.
            
            int maxRows = st.getMaxRows();
            System.out.println("\nGetting Maximum rows that can be retrieved: " + maxRows);   

    }
 
      private static void closeResources() 
    {
        //resources closed
            try 
            {
//                Closes the Statement and releases database resources associated with it.
                if (st != null) st.close();
                if (cn != null) cn.close();
                
//                isClosed()	
//                Returns true if the Statement, Connection  is closed, otherwise false.
                
                System.out.println("\nStatement Closed:"+st.isClosed());
                System.out.println("Connection Closed"+cn.isClosed());
              
            }
            catch (SQLException e) 
            {
                System.out.println(e);
            }
    }  
      
}
