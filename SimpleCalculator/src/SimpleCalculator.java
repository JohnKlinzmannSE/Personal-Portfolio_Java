//Import scanner module so user input can be read
import java.util.Scanner
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SimpleCalculator {
    public static void main(String[] args) {

        // Create variable for scanner
        Scanner scnr = new Scanner(system.in);

        // Define and initialize two variables for the two numbers to be collected from input
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();

        // Define and initialize a variable that stores the sum of the two numbers

        int sum = num1 + num2;

        // Define and initialize a variable that stores the difference of the two numbers

        int difference = Math.abs(num1) - Math.abs(num2);

        // Define and initialize a variable that stores the product of the two numbers

        int product = num1 * num2;

        // Define and initialize a variable that stores the quotient of the two numbers

        double quotient = num1 / num2

    }
}