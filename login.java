/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MoonRailSystem;

/**
 *
 * @author User
 */

import java.util.*;

public class loginMenu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int loginChoice = 0;
        
        while (loginChoice != 3) {
            System.out.print("++===================================================================================================================++\n");
            System.out.print("||       ___       ___    ________     ___          ________     ________     _____________     ________             ||\n");
            System.out.print("||      |\\  \\     |\\  \\  |\\   ____\\   |\\  \\        |\\   ____\\   |\\   ___  \\  |\\   __   __   \\  |\\   ____\\            ||\n");
            System.out.print("||      \\ \\  \\    \\ \\  \\ \\ \\  \\___|   \\ \\  \\       \\ \\  \\___|   \\ \\  \\  \\  \\ \\ \\  \\ |\\_|\\ \\  \\ \\ \\  \\___|            ||\n");
            System.out.print("||       \\ \\  \\   _\\ \\  \\ \\ \\   _\\     \\ \\  \\       \\ \\  \\       \\ \\  \\  \\  \\ \\ \\  \\ \\|| \\ \\  \\ \\ \\   _\\             ||\n");
            System.out.print("||        \\ \\  \\__| \\_\\  \\ \\ \\  \\|____  \\ \\  \\_____  \\ \\  \\_____  \\ \\  \\__\\  \\ \\ \\  \\     \\ \\  \\ \\ \\  \\|____         ||\n");
            System.out.print("||         \\ \\____________\\ \\ \\________\\ \\ \\________\\ \\ \\________\\ \\ \\________\\ \\ \\  \\     \\ \\  \\ \\ \\________\\       ||\n");
            System.out.print("||          \\|____________|  \\|________|  \\|________|  \\|________|  \\|________|  \\|___|     \\|___| \\|________|       ||\n");
            System.out.print("||                                                                                                                   ||\n");
            System.out.print("++===================================================================================================================++\n");
            System.out.print("\n");
            System.out.print("\n                                ++===================================================++");
            System.out.print("\n                                ||                                                   ||");
            System.out.print("\n                                ||     Welcome to MoonRail!                          ||");
            System.out.print("\n                                ||     Please choose a login method to continue:     ||");
            System.out.print("\n                                ||                                                   ||");
            System.out.print("\n                                ||     1. Staff                                      ||");
            System.out.print("\n                                ||     2. Customer                                   ||");
            System.out.print("\n                                ||                                                   ||");
            System.out.print("\n                                ||     3. Exit                                       ||");
            System.out.print("\n                                ||                                                   ||");
            System.out.print("\n                                ++===================================================++");
            
            try{
                System.out.print("Please select a choice: ");
                loginChoice = scanner.nextInt();
               
                switch(loginChoice){
                    case '1' :
                        System.out.print("Choice 1");
                        break;
                    case '2' :
                        System.out.print("Choice 2");
                        break;
                    case '3' :
                        System.out.print("Choice 3");
                        break;
                    default :
                        System.out.println("Error: Invalid action\n");
                }
            }
            catch(StringIndexOutOfBoundsException ex){
                System.out.println("Not a valid input...");
            }
        }
    }
}
