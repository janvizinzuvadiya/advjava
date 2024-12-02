package hotel_reservation_system;

import java.sql.Connection;
import java.util.Scanner;

public class Hotel_reservation_system 
{
    private static int choice;
    static Scanner sc=new Scanner(System.in);
    static process_request pr;
    public static void main(String[] args) 
    {
            try(Connection cn=connectionfile.getconnection())
            {
                        if(cn!=null)
                        {
                             System.out.println("Connection Established Successfully!...");

                                        while(true)
                                        {
                                            System.out.println("\nHotel Management System\nHow Can I Help You?");
                                            System.out.println("1. Reserve a Room.");
                                            System.out.println("2. View Reservations.");
                                            System.out.println("3. Get Room Number.");
                                            System.out.println("4. Update Reservation.");
                                            System.out.println("5. Delete Reservation.");
                                            System.out.println("6. Exit Menu.");

                                            System.out.print("Enter Your Choice Please:");
                                            choice=sc.nextInt();
                                                       switch(choice)
                                                       {
                                                              case 1:
                                                                  giveconnection(cn);
                                                                 pr.reservroom(sc);
                                                                  break;
                                                              case 2:
                                                                  giveconnection(cn);
                                                                  pr.viewreservation(sc);
                                                                  break;
                                                              case 3:
                                                                   giveconnection(cn);
                                                                   pr.getroomno(sc,"existing");
                                                                  break;
                                                              case 4:
                                                                   giveconnection(cn);
                                                                   pr.updatereservation(sc);
                                                                  break;
                                                              case 5:
                                                                   giveconnection(cn);
                                                                   pr.deletereservation(sc);
                                                                  break;
                                                              case 6:
                                                                  exitmenu();
                                                                  sc.close();
                                                                  return;    
                                                              default:
                                                                  System.out.println("Please Enter A valid Choice from 1 to 6...");
                                                                  break;
                                                       }              
                                        }    
                        }
                        else
                        {
                            System.out.println("Connection Failed!...");
                        }
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
    }

     public static void giveconnection(Connection cn)
    {
            pr=new process_request(cn);
    }

    private static void exitmenu() throws InterruptedException
    {   
            System.out.print("Exiting Menu");
            int i = 5;
            while(i>0)
            {
                    System.out.print(".");
                    Thread.sleep(1000);
                    i--;
            }
            System.out.println();
            System.out.println("ThankYou For Using Hotel Reservation System!!!");
    }
 
}
