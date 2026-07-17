package edu.studio.sample;

/**
 * Console application demonstrating the Calculator utility.
 */
public class ConsoleApp {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("=== Calculator Demonstration ===\n");

        // Addition
        System.out.println("Addition: 10 + 5 = " + calculator.add(10, 5));

        // Subtraction
        System.out.println("Subtraction: 10 - 5 = " + calculator.subtract(10, 5));

        // Multiplication
        System.out.println("Multiplication: 10 * 5 = " + calculator.multiply(10, 5));

        // Division
        System.out.println("Division: 10 / 5 = " + calculator.divide(10, 5));

        // Modulus
        System.out.println("Modulus: 10 % 3 = " + calculator.modulus(10, 3));

        // Power
        System.out.println("Power: 2 ^ 8 = " + calculator.power(2, 8));

        // Square Root
        System.out.println("Square Root: √16 = " + calculator.squareRoot(16));

        // Absolute Value
        System.out.println("Absolute Value: |-15| = " + calculator.absoluteValue(-15));

        // Round
        System.out.println("Round 3.14159 to 2 decimals: " + calculator.round(3.14159, 2));

        System.out.println("\n=== Complex Calculation ===");
        // Example: Calculate (10 + 5) * 2 - 8 / 2
        double result = calculator.subtract(
            calculator.multiply(calculator.add(10, 5), 2),
            calculator.divide(8, 2)
        );
        System.out.println("((10 + 5) * 2) - (8 / 2) = " + result);

        System.out.println("\nHello Jenkins!");
    }
}
