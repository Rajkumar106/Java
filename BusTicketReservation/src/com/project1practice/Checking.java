package com.project1practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Checking {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        buses.add(new Bus(1, true, 3));
        buses.add(new Bus(2, false, 5));
        buses.add(new Bus(3, true, 5));

        ArrayList<Booking> bookings = new ArrayList<>(); // Initialize booking ArrayList

        Scanner sc = new Scanner(System.in); // Move Scanner declaration outside the loop

        for (Bus b : buses) {
            b.displayBusInfo();
        }

        int i;
        do {
            System.out.println("Press 1 to Book and any other number to Exit");
            i = sc.nextInt();
            if (i == 1) {
                Booking b = new Booking();
                if (b.isAvailable(bookings, buses)) {
                    bookings.add(b);
                    System.out.println("Booking is confirmed...");
                } else {
                    System.out.println("Sorry, the bus is full. Try another bus...");
                }
            }
        } while (i == 1); // Exit loop when i is not 1

        System.out.println("Exited");
    }
}
