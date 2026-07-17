package edu.studio.sample;

/**
 * A simple calculator utility class that provides basic arithmetic operations.
 */
public class Calculator {

    /**
     * Adds two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first number.
     *
     * @param a the first number
     * @param b the second number (to be subtracted)
     * @return the difference of a and b
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     *
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first number by the second number.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the quotient of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    /**
     * Calculates the modulus (remainder) of two numbers.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the remainder of a divided by b
     * @throws ArithmeticException if b is zero
     */
    public double modulus(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Modulus by zero is not allowed");
        }
        return a % b;
    }

    /**
     * Calculates the power of a number.
     *
     * @param base the base number
     * @param exponent the exponent
     * @return base raised to the power of exponent
     */
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    /**
     * Calculates the square root of a number.
     *
     * @param a the number
     * @return the square root of a
     * @throws ArithmeticException if a is negative
     */
    public double squareRoot(double a) {
        if (a < 0) {
            throw new ArithmeticException("Square root of negative number is not allowed");
        }
        return Math.sqrt(a);
    }

    /**
     * Calculates the absolute value of a number.
     *
     * @param a the number
     * @return the absolute value of a
     */
    public double absoluteValue(double a) {
        return Math.abs(a);
    }

    /**
     * Rounds a number to a specified number of decimal places.
     *
     * @param value the number to round
     * @param decimalPlaces the number of decimal places
     * @return the rounded number
     */
    public double round(double value, int decimalPlaces) {
        if (decimalPlaces < 0) {
            throw new IllegalArgumentException("Decimal places cannot be negative");
        }
        double multiplier = Math.pow(10, decimalPlaces);
        return Math.round(value * multiplier) / multiplier;
    }
}

