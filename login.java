package assingment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class login {
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    int userInput1;
    
    System.out.println("        ___       __   _______   ___       ________  ________  _____ ______   _______       ");
    System.out.println("       |\\  \\     |\\  \\|\\  ___ \\ |\\  \\     |\\   ____\\|\\   __  \\|\\   _ \\  _   \\|\\  ___ \\      ");
    System.out.println("       \\ \\  \\    \\ \\  \\ \\   __/|\\ \\  \\    \\ \\  \\___|\\ \\  \\|\\  \\ \\  \\\\\\__\\ \\  \\ \\   __/|     ");
    System.out.println("        \\ \\  \\    \\ \\  \\ \\   __/|\\ \\  \\    \\ \\  \\___|\\ \\  \\|\\  \\ \\  \\\\\\__\\ \\  \\ \\   __/|    ");
    System.out.println("         \\ \\  \\|\\__\\_\\  \\ \\  \\_|\\ \\ \\  \\____\\ \\  \\____\\ \\  \\\\\\  \\ \\  \\    \\ \\  \\ \\  \\_|\\ \\  ");
    System.out.println("          \\ \\____________\\  \\_______\\ \\_______\\ \\_______\\ \\_______\\ \\__\\    \\ \\__\\ \\_______\\ ");
    System.out.println("           \\ \\____________\\  \\_______\\ \\_______\\ \\_______\\ \\_______\\ \\__\\    \\ \\__\\ \\_______\\");
    System.out.print("\n                                       ");
    System.out.print("\n              ++=====================++");
    System.out.print("\n              ||                     ||");
    System.out.print("\n              ||     1. Staff        ||");
    System.out.print("\n              ||     2. Customer     ||");
    System.out.print("\n              ||                     ||");
    System.out.print("\n              ||     3. Exit         ||");
    System.out.print("\n              ||                     ||");
    System.out.print("\n              ++=====================++");
    
    userInput1 = scanner.nextInt();
    
    try{
        while(true){
            System.out.print("Please select a choice: ");
            
            if (userInput1<3){
                switch(userInput1){
                    case '1' :
                        staffMenu.main(args);
                        break;
                    case '2' :
                        main_menu.main(args);
                        break;
                    case '3' :
                        break;
                }
            }
            else
            {
                System.out.println("Error: Invalid action\n");
            }
        }
    }
    catch (StringIndexOutOfBoundsException ex)
    {
        System.out.println("Not a valid input...");
    }
}
}
