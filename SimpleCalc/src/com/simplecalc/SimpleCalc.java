package com.simplecalc;

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] arg) {

        //        Initialize scanner for user input
        Scanner scnr = new Scanner(System.in);

//        Make program more interesting by adding greeting for user
        System.out.println("Hello and welcome to Simple Calculator. What is your name?");
        String name = scnr.nextLine();

        //        Define and initialize two variables that collect two different numbers from user
        System.out.println("Hi, " + name + "!" + " Choose your first number.");
        int num1 = scnr.nextInt();
        System.out.println("Choose your second number.");
        int num2 = scnr.nextInt();
//        Print blank line in between input and output
        System.out.println();

        //        Define and initialize a variable that stores the sum of the two numbers.

        int sum = num1 + num2;
//        System.out.print(sum);

        //        Define and initialize a variable that stores the difference of the two numbers.

        int difference = num1 - num2;
//        System.out.print(difference);

        //        Define and initialize a variable that stores the product of the two numbers.

        int product = num1 * num2;
//        System.out.print(product);

//        Define and initialize a variable that stores the quotient of the two numbers.

        int quotient = num1 / num2;
//        System.out.print(quotient);

        double dblQuotient = (double) num1 / num2;
//        System.out.print(quotient);

//        Print the output for each calculation using the provided formatting in the README

        System.out.println("The sum of " + num1 + " plus " + num2 + " is: ");
        System.out.println(sum);
        System.out.println("The difference of " + num1 + " minus " + num2 + " is: ");
        System.out.println(difference);
        System.out.println("The product of " + num1 + " times " + num2 + " is: ");
        System.out.println(product);
        System.out.println("The quotient of " + num1 + " divided by " +  num2  + " using integer division is: ");
        System.out.println(quotient);
        System.out.println("The quotient of " + num1 + " divided by " +  num2  + " using decimal division is: ");
        System.out.println(dblQuotient);
    }
}
