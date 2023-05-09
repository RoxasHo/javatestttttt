/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moonrailsystem;


public class ReservationSystem {
    private Train[] trains;

    public ReservationSystem() {
        this.trains = new Train[3];
        this.trains[0] = new Train("Train 1", 20);
        this.trains[1] = new Train("Train 2", 20);
        this.trains[2] = new Train("Train 3", 20);
    }

    public Train[] getTrains() {
        return trains;
    }

    public boolean reserveSeat(int trainNum, int seatNum, String passengerName) {
        Train train = trains[trainNum - 1];
        return train.reserveSeat(seatNum, passengerName);
    }
}
