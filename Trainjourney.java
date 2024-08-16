/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MUDA GADGETS
 */
public class Trainjourney {
    public static void main(String[] args) {
        int totalDistance = 10000; // distance in kilometers
        int offloadDistance = 150; // distance after which offloading occurs
        int refuelDistance = 200; // distance after which refueling occurs

        int offloadStops = totalDistance / offloadDistance;
        int refuelStops = totalDistance / refuelDistance;

        // We need to subtract 1 if the last stop does not require offloading or refueling
        // because the last stop at 10000 km will not be counted in these intervals.
        // If the exact distance is a multiple of the stop distance, it means the last stop is included in the count.
        if (totalDistance % offloadDistance == 0) {
            offloadStops--;
        }
        if (totalDistance % refuelDistance == 0) {
            refuelStops--;
        }

        int totalStops = offloadStops + refuelStops;

        System.out.println("Total number of stops for offloading and refueling: " + totalStops);
    }
}
    

