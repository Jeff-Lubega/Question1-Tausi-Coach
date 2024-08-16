/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUDA GADGETS
 */
public class JourneyTime {
     public static void main(String[] args) {
        int totalDistance = 10000; // total distance in kilometers
        int speed = 250; // speed in kilometers per hour
        int stopTime = 5; // time per stop in minutes

        // Calculate travel time
        double travelTimeHours = (double) totalDistance / speed;

        // Calculate number of stops
        int offloadDistance = 150;
        int refuelDistance = 200;
        int offloadStops = totalDistance / offloadDistance;
        int refuelStops = totalDistance / refuelDistance;

        // Subtract 1 if the last stop is exactly at the end of the journey
        if (totalDistance % offloadDistance == 0) {
            offloadStops--;
        }
        if (totalDistance % refuelDistance == 0) {
            refuelStops--;
        }

        int totalStops = offloadStops + refuelStops;

        // Calculate total stop time in hours
        double totalStopTimeHours = (totalStops * stopTime) / 60.0;

        // Total time including stops
        double totalTimeHours = travelTimeHours + totalStopTimeHours;

        System.out.println("Total time taken to travel from Kampala to Kabale: " + totalTimeHours + " hours");
    }
}
    

