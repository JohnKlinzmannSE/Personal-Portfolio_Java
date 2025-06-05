package com.simplecalc;

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] arg) {

//        Initialize scanner for user input
        Scanner scnr = new Scanner(System.in);

//        Define and initialize two variables that collect two different numbers from user
        System.out.println("Choose your first number.");
        int num1 = scnr.nextInt();
        System.out.println("Choose your second number.");
        int num2 = scnr.nextInt();

        System.out.println(num1);
        System.out.println(num2);

    }
}
