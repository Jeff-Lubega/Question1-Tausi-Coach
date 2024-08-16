/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUDA GADGETS
 */
public class ReturnJourneyTime {
    public static void main(String[] args) {
        int totalDistance = 10000; // total distance in kilometers
        int speed = 250; // speed in kilometers per hour
        int refuelDistance = 200; // distance after which refueling occurs
        int stopTime = 5; // time per stop in minutes

        // Calculate travel time
        double travelTimeHours = (double) totalDistance / speed;

        // Calculate number of refueling stops
        int refuelStops = totalDistance / refuelDistance;

        // Subtract 1 if the last stop is exactly at the end of the journey
        if (totalDistance % refuelDistance == 0) {
            refuelStops--;
        }

        // Calculate total refuel stop time in hours
        double totalRefuelStopTimeHours = (refuelStops * stopTime) / 60.0;

        // Total time including refuel stops
        double totalTimeHours = travelTimeHours + totalRefuelStopTimeHours;

        System.out.println("Total time taken for the return journey from Kabale to Kampala: " + totalTimeHours + " hours");
    }
}
    

