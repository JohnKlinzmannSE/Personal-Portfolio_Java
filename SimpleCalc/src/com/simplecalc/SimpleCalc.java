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

        //        Define and initialize a variable that stores the sum of the two numbers.

//        int sum = num1 + num2;
//        System.out.print(sum);

        //        Define and initialize a variable that stores the difference of the two numbers.

//        int difference = num1 - num2;
//        System.out.print(difference);

        //        Define and initialize a variable that stores the product of the two numbers.

//        int product = num1 * num2;
//        System.out.print(product);

//        Define and initialize a variable that stores the quotient of the two numbers.

//        int quotient = num1 / num2;
//        System.out.print(quotient);

        double quotient = (double) num1 / num2;
        System.out.print(quotient);

//        Print the output for each calculation using the following formatting:

    }
}
