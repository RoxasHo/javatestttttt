/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonrailsystem;


public class Seat {
    private int number;
    private boolean available;
    private String passengerName;

    public Seat(int number) {
        this.number = number;
        this.available = true;
    }

    public int getNumber() {
        return number;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void reserve(String passengerName) {
        this.passengerName = passengerName;
        this.available = false;
    }

    public void cancelReservation() {
        this.passengerName = null;
        this.available = true;
    }
}
