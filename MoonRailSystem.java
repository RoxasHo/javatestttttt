/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moonrailsystem;

import java.util.Scanner;
        
public class MoonRailSystem {

    
   
      public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        Scanner scanner = new Scanner(System.in);

        // Print available trains
        Train[] trains = reservationSystem.getTrains();
        System.out.println("Available Trains:");
        for (int i = 0; i < trains.length; i++) {
            System.out.println((i + 1) + ". " + trains[i].getName());
        }

        // Prompt for train selection
        System.out.print("Select a train (1-" + trains.length + "): ");
        int selectedTrain = scanner.nextInt();

        if (selectedTrain < 1 || selectedTrain > trains.length) {
            System.out.println("Invalid train selection.");
            return;
        }

        // Print seat availability for the selected train
        Train selectedTrainObj = trains[selectedTrain - 1];
        System.out.println("Seat Availability for " + selectedTrainObj.getName());
        Seat[] seats = selectedTrainObj.getSeats();
        for (Seat seat : seats) {
            System.out.println("Seat " + seat.getNumber() + ": " + (seat.isAvailable() ? "Available" : "Reserved"));
        }

        // Prompt for seat selection
        System.out.print("Select a seat (1-" + seats.length + "): ");
        int selectedSeat = scanner.nextInt();

        if (selectedSeat < 1 || selectedSeat > seats.length || !seats[selectedSeat - 1].isAvailable()) {
            System.out.println("Invalid seat selection or seat already reserved.");
            return;
        }

        // Prompt for passenger name
        System.out.print("Enter passenger name: ");
        scanner.nextLine(); // Consume the newline character
        String passengerName = scanner.nextLine();

        // Reserve the seat
        boolean reservationSuccessful = reservationSystem.reserveSeat(selectedTrain, selectedSeat, passengerName);

        if (reservationSuccessful) {
            System.out.println("Seat reserved successfully!");
        } else {
            System.out.println("Seat reservation failed.");
        }
    }
    
}
