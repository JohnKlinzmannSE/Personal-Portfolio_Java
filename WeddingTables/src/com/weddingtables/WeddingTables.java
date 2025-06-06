package com.weddingtables;

import java.util.Scanner;

public class WeddingTables {
    public static void main(String[] arg) {

        //      Number of guests that can sit at each table
        int guestsPerTable = 10;

        //      Get total wedding guests input from user
        Scanner scnr = new Scanner(System.in);

//        Greet user
        System.out.println("Welcome to Wedding Planner 2025!");
        System.out.println("The tables available at your venue can seat 10 guests each.");
        System.out.println("Let us help you plan the perfect wedding by making sure everyone has a seat at the table.");

//        Ask user for number of guests attending wedding
        System.out.println("How many guests will be attending the wedding?");

        int guests = scnr.nextInt();

//        Calculate how many tables will be filled by the input guests and output table number

        int tablesFilled = guests / guestsPerTable;
        System.out.println("Your guests will fill " + tablesFilled  + " tables.");

//        Determine if there are any extra guests that are not seated at a table
        int extraGuests = guests % guestsPerTable;
        System.out.println(extraGuests + " remaining guests will also need a place to sit.");

//        Determine how many additional tables are needed to seat the extra guests
        if(extraGuests > 0 && extraGuests <= 10) {
            int tablesNeeded = tablesFilled + 1;
            System.out.println("So the total tables needed are " +  tablesNeeded + ".");
        }

    }
}
