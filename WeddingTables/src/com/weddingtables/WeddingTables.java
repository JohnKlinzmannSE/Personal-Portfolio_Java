package com.weddingtables;

import java.util.Scanner;

public class WeddingTables {
    public static void main(String[] arg) {

        //      Number of guests that can sit at each table
        int guestsPerTable = 10;

        //      Get total wedding guests input from user
        Scanner scnr = new Scanner(System.in);

//        Ask user for number of guests attending wedding
        System.out.println("How many guests will be attending the wedding?");

        int guests = scnr.nextInt();

//        Calculate how many tables will be filled by the input guests and output table number

        int tablesFilled = guests / guestsPerTable;
        System.out.println("Tables filled: " + tablesFilled);

//        Determine if there are any extra guests that are not seated at a table
        int extraGuests = guests % guestsPerTable;
        System.out.println("Guests that need a seat at a table: " + extraGuests);

//        Determine how many additional tables are needed to seat the extra guests
        if(extraGuests <= 10) {
            int tablesNeeded = tablesFilled + 1;
            System.out.println("Tables needed: " +  tablesNeeded);
        }

    }
}
