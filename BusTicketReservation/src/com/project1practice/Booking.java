package com.project1practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
    String passengerName;
    int busNo;
    Date date;
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    Scanner sc = new Scanner(System.in);

    Booking() {
        formatter.setLenient(false); // Ensuring strict date parsing

        System.out.println("Please enter passenger name:");
        passengerName = sc.nextLine();

        System.out.println("Please enter bus no:");
        busNo = sc.nextInt();

        sc.nextLine(); // Consume the newline character

        System.out.println("Enter date in DD-MM-YYYY:");
        String s = sc.nextLine();

        try {
            date = formatter.parse(s);
            System.out.println("Date entered: " + formatter.format(date));
        } catch (ParseException e) {
            System.out.println("Invalid date format! Please enter the date in DD-MM-YYYY format.");
        }
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int totalCapacity = 0;
        int totalBooked = 0;

        // Find the capacity of the specific bus
        for (Bus b : buses) {
            if (b.getBusNo() == busNo) {
                totalCapacity = b.getCapacity();
                break;
            }
        }

        // Count the number of bookings for the specific bus on the given date
        for (Booking booking : bookings) {
            if (booking.busNo == busNo && booking.date.equals(this.date)) {
                totalBooked++;
            }
        }

        // Check if the number of booked seats is less than the bus capacity
        return totalBooked < totalCapacity;
    }
}
