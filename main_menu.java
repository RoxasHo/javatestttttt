package assingment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


public class main_menu {
    
    public static void main(String[] args){
    System.out.println("\n---------------------------------------------");
    System.out.println("Welcome to Sohai Hotel Reservation System");
    System.out.println("---------------------------------------------");
    System.out.println("\n--Please log in to the system--");	
    
    try
    {
        
        
        Scanner scanner = new Scanner(System.in);
        char userInput1;
        int userInput2;

        mainmenu:
        do{
            System.out.println("\n1. Book a seat \n2.Display train detail \n3.Display seat Availability \n\n4.Payment \n5.exit");
            userInput2 = scanner.nextInt();
            switch(userInput2){
                case 1: 
                    break;
                case 2: 
                    break;
                case 3: 
                    break;
                case 4: 
                    break;
                case 5: 
                    break;
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            System.out.println("\nContinue : (y/n)");
            userInput1 = scanner.next().charAt(0); 
            if(!(userInput1=='Y' || userInput1=='y' || userInput1=='N'||userInput1=='n'))
            {
                System.out.println("Invalid Option");
                System.out.println("\nContinue : (y/n)");
                userInput1 = scanner.next().charAt(0); 
            }
        }while(userInput1=='Y' || userInput1=='y');
    }
    catch(Exception e)
        {
            System.out.println("Not a valid input");
        }
    }
}
