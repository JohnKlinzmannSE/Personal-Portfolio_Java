package com.weddingtables;

import java.util.Scanner;

public class WeddingTables {
    public static void main(String[] arg) {

        //      Number of guests that can sit at each table
        int guestsPerTable = 10;

        //      Get total wedding guests input from user
        Scanner scnr = new Scanner(System.in);

//        Ask user for number of guests attending wedding

        int guests = scnr.nextInt();

//        Calculate how many tables will be filled by the input guests and output table number

        int tablesFilled = guests / guestsPerTable;
        System.out.print(tablesFilled);

//        Calculate how many tables will be needed to seat all guests

        int tablesNeeded = tablesFilled % guests;
        System.out.print(tablesNeeded);

    }
}
