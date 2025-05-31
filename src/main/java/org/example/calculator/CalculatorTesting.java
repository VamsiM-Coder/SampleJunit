package org.example.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

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
        assertEquals(2, result, "5 - 3 should be 2");
    }

    @Test
    void testMultiplication() {
        int result = calculator.multiply(4, 3);
        assertEquals(12, result, "4 * 3 should be 12");
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
