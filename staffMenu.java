package assingment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class staffMenu {
    public static void main(String[] args){
    System.out.println("\n---------------------------------------------");
    System.out.println("Welcome to Sohai Hotel Reservation System");
    System.out.println("---------------------------------------------");
    System.out.println("\n--Please log in to the system--");	
    
    try
    {
        String Username="Staff";
        String Password="0000";
        
        Scanner userInput1 = new Scanner(System.in);
        System.out.println("\n Enter username: ");
        String username = userInput1.next();
        
        Scanner userInput2 = new Scanner(System.in);
        System.out.println("\n Enter Password: ");
        String password = userInput2.next();
        
        if (username.equals(Username) && password.equals(Password))
        {
            System.out.println("\n Access Granted!!!");
        }
        else if (username.equals(Username))
        {
            System.out.println("\nInvalid password, Please try again.");
            System.exit(0);
        }
        else if (username.equals(Password))
        {
            System.out.println("\nInvalid username, Please try again.");
            System.exit(0);
        }
        else
        {
            System.out.println("\nInvalid Username and password, Please try again bobo , if not i call polis.");
            System.exit(0);
        }
        
        Scanner scanner = new Scanner(System.in);
        int userInput4;
        char userInput3;
        
        mainmenu:
        do{
            System.out.println("\n1.Show All Customer \n2.Show All Booking \n3.Show all Train Detail \n4.Display Seat Availability \n\n5.exit");
            userInput4 = scanner.nextInt();
            switch(userInput4){
                case 1: 
                    //show all Customer
                    break;
                case 2:
                    //show all booking
                    break;
                case 3:
                    //show all train detail
                    break;
                case 4:
                    //show all seat available
                    break;
                case 5:
                    break;
            }
            
            System.out.println("\nContinue : (y/n)");
            userInput3 = scanner.next().charAt(0); 
            if(!(userInput3=='Y' || userInput3=='y' || userInput3=='N'|| userInput3=='n'))
            {
                System.out.println("Invalid Option");
                System.out.println("\nContinue : (y/n)");
                userInput3 = scanner.next().charAt(0); 
            }
        }while(userInput3=='Y' || userInput3=='y');
        
        
        
        
    }
    catch(Exception e)
        {
            System.out.println("Not a valid input");
        }
    }
}
