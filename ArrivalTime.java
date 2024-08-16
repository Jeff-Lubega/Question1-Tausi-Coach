/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class TrainArrivalTime {
     public static void main(String[] args) {
        double totalDistance = 10000; // total distance in kilometers
        double speedMps = 225.5; // speed in meters per second

        // Convert speed from meters per second to kilometers per hour
        double speedKph = speedMps * 3.6;

        // Calculate travel time in hours
        double travelTimeHours = totalDistance / speedKph;

        // Departure time
        int departureHour = 9; // 09:00 hrs in 24-hour format

        // Calculate arrival time
        double arrivalTimeHours = departureHour + travelTimeHours;

        // Convert arrival time to hours and minutes
        int arrivalHours = (int) arrivalTimeHours;
        int arrivalMinutes = (int) ((arrivalTimeHours - arrivalHours) * 60);

        // Print arrival time
        System.out.println("Arrival time of the second coach: " + arrivalHours + ":" + String.format("%02d", arrivalMinutes));
    }
}
    

