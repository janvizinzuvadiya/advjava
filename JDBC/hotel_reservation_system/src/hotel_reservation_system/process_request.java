package hotel_reservation_system;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class process_request
{
    private static Connection cn;
    PreparedStatement pst;
    ResultSet rs;
    
    private int res_id;
    private String guest_name;
    private int room_no;
    private double contact_no;
    private String res_date;

    process_request(Connection cn)
    {
        this.cn=cn;    
    }
    
    public void reservroom(Scanner sc) throws SQLException
    {
            String query=("insert into reservations (guest_name,room_no,contact_no) values(?,?,?)");
            pst=cn.prepareStatement(query,Statement.RETURN_GENERATED_KEYS); 
           
            System.out.println("\nPlease Enter Futher Details:");
            System.out.print("Guest's Name:");
            guest_name=sc.next();
            System.out.print("Room No:");
            room_no=sc.nextInt();
            System.out.print("Guest's Contact Number:");
            contact_no=sc.nextDouble();

           pst.setString(1, guest_name);
           pst.setInt(2, room_no);
           pst.setDouble(3, contact_no);

             int ans=pst.executeUpdate();
         
           if (ans > 0) {
              
                    try (ResultSet rs = pst.getGeneratedKeys()) 
                    {
                            if (rs.next()) 
                            {      
                                res_id=(int)  rs.getLong(1);
                            }
                    }
           
            if(ans>0)
            {
                System.out.println("\nReservation is Complete!\nYou can Get the Keys Now!!");
            }
            else
            {
                System.out.println("\nSorry for inconvenience Reservation Failed!!");
            }
            
            getroomno(sc,"new");
    
            }
        }
    
   public void viewreservation(Scanner sc) throws SQLException 
    {
            pst=cn.prepareStatement("select * from reservations");
            rs=pst.executeQuery();

            System.out.println("+-----------------+----------------------+-------------+-----------------+-----------------------+");
            System.out.printf("| %-15s | %-20s | %-10s | %-15s | %-21s |\n", "Registration ID", "Guest Name", "Room Number", "Contact Number", "Registration Date");
            System.out.println("+-----------------+----------------------+-------------+-----------------+-----------------------+");

            while(rs.next())
            {
                res_id=rs.getInt(1);
                guest_name=rs.getString(2);
                room_no=rs.getInt(3);
                contact_no=rs.getDouble(4);
                res_date=rs.getTimestamp(5).toString();

                System.out.printf("| %-15d | %-20s | %-11d | %-15.0f | %-21s |\n", 
                          res_id, guest_name, room_no, contact_no, res_date);
            }

             System.out.println("+-----------------+----------------------+-------------+-----------------+-----------------------+");

             if(rs==null)
             {
                 System.out.println("No Reservations Found!");
             }
        
    }

    public void getroomno(Scanner sc,String state) throws SQLException 
    {
               pst=cn.prepareStatement("select * from reservations where res_id=?");  
               
               if(state=="existing")
               {
                        System.out.print("\nTo get information \nEnter Reservation_Id:");
                        res_id=sc.nextInt();         
               }
               
               pst.setInt(1, res_id);
               rs=pst.executeQuery();
               
               System.out.println("+-----------------+----------------------+-------------+-----------------+-----------------------+");
               System.out.printf("| %-15s | %-20s | %-10s | %-15s | %-21s |\n", "Registration ID", "Guest Name", "Room Number", "Contact Number", "Registration Date");
               System.out.println("+-----------------+----------------------+-------------+-----------------+-----------------------+");

            while(rs.next())
            {
                res_id=rs.getInt(1);
                guest_name=rs.getString(2);
                room_no=rs.getInt(3);
                contact_no=rs.getDouble(4);
                res_date=rs.getTimestamp(5).toString();

                System.out.printf("| %-15d | %-20s | %-11d | %-15.0f | %-21s |\n", res_id, guest_name, room_no, contact_no, res_date);
            }

             System.out.println("+-----------------+----------------------+-------------+-----------------+-----------------------+");

             if(rs==null)
             {
                 System.out.println("No Reservations Found!!");
             }
    }

   public  void updatereservation(Scanner sc) throws SQLException
    {
            pst=cn.prepareStatement("update reservations set guest_name=?,room_no=?,contact_no=?,res_date=? where res_id=?");  
            
            System.out.println("\nEnter Details to Update Information");
            
            System.out.print("Enter Reserfvation_Id:");
            res_id=sc.nextInt();
            
            System.out.print("Enter Guest_Name:");
            guest_name=sc.next();
            
            System.out.print("Enter Room_Number:");
            room_no=sc.nextInt();
            
            System.out.print("Enter Contact_Number:");
            contact_no=sc.nextDouble();
            
            System.out.print("Enter Reservation_Date and Time:");
            res_date=sc.next();
            
            pst.setString(1, guest_name);
            pst.setInt(2, room_no);
            pst.setDouble(3,contact_no);
            pst.setString(4, res_date);
            
            pst.setInt(5, res_id);
           
            int ans=pst.executeUpdate();
            
              if(ans>0)
             {
                 System.out.println("\nYour Reservation is Updated!!");
                 getroomno(sc,"updated");   
             }
            else
            {
                  System.out.println("\nFailed Update!!");
            }
            
            
    }

    public void deletereservation(Scanner sc) throws SQLException 
    {
            pst=cn.prepareStatement("delete from reservations where res_id=?");  

            System.out.println("\nEnter Details to Delete Reservation");
        
            System.out.print("Enter Reserfvation_Id:");
            res_id=sc.nextInt();
        
            pst.setInt(1, res_id);
            int ans=pst.executeUpdate();
            
             if(ans>0)
             {
                 System.out.println("\nYour Reservation is Deleted!!");
                 getroomno(sc,"Deleted");   
             }
            else
            {
                  System.out.println("\nFailed Delete!!");
            }
    }
        
}
