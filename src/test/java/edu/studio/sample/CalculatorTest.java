package edu.studio.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Calculator Tests")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    // Addition Tests
    @Test
    @DisplayName("Should add two positive numbers")
    void testAddPositiveNumbers() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    @DisplayName("Should add positive and negative numbers")
    void testAddMixedNumbers() {
        assertEquals(-1, calculator.add(2, -3));
    }

    @Test
    @DisplayName("Should add two negative numbers")
    void testAddNegativeNumbers() {
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    @DisplayName("Should add zero to a number")
    void testAddZero() {
        assertEquals(5, calculator.add(5, 0));
    }

    // Subtraction Tests
    @Test
    @DisplayName("Should subtract two positive numbers")
    void testSubtractPositiveNumbers() {
        assertEquals(-1, calculator.subtract(2, 3));
    }

    @Test
    @DisplayName("Should subtract negative from positive")
    void testSubtractNegativeFromPositive() {
        assertEquals(5, calculator.subtract(2, -3));
    }

    @Test
    @DisplayName("Should subtract and get zero")
    void testSubtractGetZero() {
        assertEquals(0, calculator.subtract(5, 5));
    }

    // Multiplication Tests
    @Test
    @DisplayName("Should multiply two positive numbers")
    void testMultiplyPositiveNumbers() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    @DisplayName("Should multiply by zero")
    void testMultiplyByZero() {
        assertEquals(0, calculator.multiply(5, 0));
    }

    @Test
    @DisplayName("Should multiply positive and negative")
    void testMultiplyMixedSigns() {
        assertEquals(-6, calculator.multiply(2, -3));
    }

    // Division Tests
    @Test
    @DisplayName("Should divide two positive numbers")
    void testDividePositiveNumbers() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    @DisplayName("Should throw exception when dividing by zero")
    void testDivideByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }

    @Test
    @DisplayName("Should divide and get decimal result")
    void testDivideDecimalResult() {
        assertEquals(2.5, calculator.divide(5, 2));
    }

    // Modulus Tests
    @Test
    @DisplayName("Should calculate modulus correctly")
    void testModulus() {
        assertEquals(1, calculator.modulus(5, 2));
    }

    @Test
    @DisplayName("Should throw exception for modulus by zero")
    void testModulusByZeroThrowsException() {
        assertThrows(ArithmeticException.class, () -> calculator.modulus(5, 0));
    }

    @Test
    @DisplayName("Should calculate modulus when divisible")
    void testModulusWhenDivisible() {
        assertEquals(0, calculator.modulus(6, 3));
    }

    // Power Tests
    @Test
    @DisplayName("Should calculate power correctly")
    void testPower() {
        assertEquals(8, calculator.power(2, 3));
    }

    @Test
    @DisplayName("Should calculate power with zero exponent")
    void testPowerZeroExponent() {
        assertEquals(1, calculator.power(5, 0));
    }

    @Test
    @DisplayName("Should handle negative exponent")
    void testPowerNegativeExponent() {
        assertEquals(0.25, calculator.power(2, -2));
    }

    // Square Root Tests
    @Test
    @DisplayName("Should calculate square root")
    void testSquareRoot() {
        assertEquals(3, calculator.squareRoot(9));
    }

    @Test
    @DisplayName("Should throw exception for negative square root")
    void testSquareRootNegativeThrowsException() {
        assertThrows(ArithmeticException.class, () -> calculator.squareRoot(-1));
    }

    @Test
    @DisplayName("Should calculate square root of zero")
    void testSquareRootZero() {
        assertEquals(0, calculator.squareRoot(0));
    }

    @Test
    @DisplayName("Should calculate square root of decimal")
    void testSquareRootDecimal() {
        assertEquals(2.0, calculator.squareRoot(4.0));
    }

    // Absolute Value Tests
    @Test
    @DisplayName("Should get absolute value of positive number")
    void testAbsoluteValuePositive() {
        assertEquals(5, calculator.absoluteValue(5));
    }

    @Test
    @DisplayName("Should get absolute value of negative number")
    void testAbsoluteValueNegative() {
        assertEquals(5, calculator.absoluteValue(-5));
    }

    @Test
    @DisplayName("Should get absolute value of zero")
    void testAbsoluteValueZero() {
        assertEquals(0, calculator.absoluteValue(0));
    }

    // Round Tests
    @Test
    @DisplayName("Should round to specified decimal places")
    void testRound() {
        assertEquals(3.14, calculator.round(3.14159, 2));
    }

    @Test
    @DisplayName("Should round to zero decimal places")
    void testRoundZeroDecimals() {
        assertEquals(3.0, calculator.round(3.7, 0));
    }

    @Test
    @DisplayName("Should throw exception for negative decimal places")
    void testRoundNegativeDecimalThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.round(3.14, -1));
    }

    // Parameterized Tests
    @ParameterizedTest
    @CsvSource({
        "1, 1, 2",
        "2, 3, 5",
        "-1, 1, 0",
        "0, 0, 0",
        "100, 200, 300"
    })
    @DisplayName("Should add multiple test cases")
    void testAddParameterized(double a, double b, double expected) {
        assertEquals(expected, calculator.add(a, b));
    }

    @ParameterizedTest
    @CsvSource({
        "10, 2, 5",
        "9, 3, 3",
        "100, 10, 10",
        "7, 2, 3.5"
    })
    @DisplayName("Should divide multiple test cases")
    void testDivideParameterized(double a, double b, double expected) {
        assertEquals(expected, calculator.divide(a, b));
    }
}

