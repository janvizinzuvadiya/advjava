package resultsetmethods;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Resultsetmethods 
{
    public static void main(String[] args) 
    {
        Connection cn;
        PreparedStatement pst;
        ResultSet rs; 
       Scanner sc;
        int row;
        int choice=0;
            try
            {
                      sc=new Scanner(System.in);
                      cn=connectionfile.getconnection();
                      String Query="select * from emp";
                      pst=cn.prepareStatement(Query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                      rs=pst.executeQuery();
                      
                     do
                     {
                            System.out.println("\nHere are the option to select employee data table:");
                            System.out.println("\n1] select everything from the table\n"
                                                           + "2]select first row\n"
                                                           +"3]select last row\n"
                                                           +"4]select particular row\n"
                                                           +"5]select row above or below from current row\n"
                                                           +"6]done researching\n");
                            System.out.print("Enter your choice to select data from database:  ");
                            choice=sc.nextInt();
                            System.out.println("");
                                switch(choice)
                                {     

                                    case 1:
                                        while(rs.next())
                                        { 
                                            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getDouble(4));   
                                        }
                                        break;

                                    case 2:
                                          System.out.print("First row:  ");
                                          rs.first();
                                          System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getDouble(4)+"\n");
                                          break;

                                    case 3:
                                          System.out.print("last row:  ");
                                          rs.last();
                                          System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getDouble(4)+"\n");
                                          break;

                                    case 4:
                                          System.out.print("Enter the id to show details:  ");
                                          row=sc.nextInt();
                                          rs.absolute(row);
                                          System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getDouble(4)+"\n");
                                          break;

                                    case 5:
                                          System.out.print("Enter the stapes to show details:  ");
                                          row=sc.nextInt();
                                          rs.relative(row);
                                          System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getDouble(4)+"\n");                     
                                          break;

                                    case 6:
                                          System.out.println("Exiting menu");
                                          break;

                                    default:
                                          System.out.print("Enter Valis choice between 1 to 6");
                                          break;
                                }
                     }while(choice!=6);              
            }
            catch(Exception e)
            {
                System.out.println(e);
            }      
    }   
}
