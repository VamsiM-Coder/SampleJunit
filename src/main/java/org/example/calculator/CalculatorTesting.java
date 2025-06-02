package org.example.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

// JUnit is an open-source framework that allows developers to write and run repeatable tests in Java.
// It's essential for unit testing, ensuring that individual pieces of code (usually methods) work correctly.
// It provides annotations, assertions, and test runners to facilitate writing and executing tests efficiently.

//@Test — Marks a method as a test.
//
//@BeforeEach — Code to run before each test.
//
//@AfterEach — Code to run after each test.
//
//@BeforeAll — Code to run once before all tests (static method).
//
//@AfterAll — Code to run once after all tests (static method).

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTesting {

    private Calculator calculator;

    @BeforeAll
    void initAll() {
        System.out.println("Before all tests");
    }

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Before each test");
    }

    @Test
    void testAddition() {
        int result = calculator.add(2, 3);
        assertEquals(5, result, "2 + 3 should be 5");
    }

    @Test
    void testSubtraction() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    void testMultiplication() {
        int result = calculator.multiply(4, 3);
        assertEquals(12, result);
    }

    @Test
    void testDivision() {
        int result = calculator.divide(10, 2);
        assertEquals(5, result, "10 / 2 should be 5");
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0), "Division by zero should throw ArithmeticException");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each test");
    }

    @AfterAll
    void tearDownAll() {
        System.out.println("After all tests");
    }
}
