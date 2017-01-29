package com.github.mwtaylor.javamath.fibonacci;

import com.github.mwtaylor.javamath.Fibonacci;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PreviousFibonacciNumberTest {
    @Test
    public void calculatePreviousFibonacciIndex() {
        assertEquals(0, Fibonacci.indexOfNearestFibonacciNumber(0));
        assertEquals(2, Fibonacci.indexOfNearestFibonacciNumber(1));
        assertEquals(3, Fibonacci.indexOfNearestFibonacciNumber(2));
        assertEquals(4, Fibonacci.indexOfNearestFibonacciNumber(3));

        for (int n = 5; n < 70; n++) {
            assertEquals(n, Fibonacci.indexOfNearestFibonacciNumber(Fibonacci.fibonacci(n) - 1));
            assertEquals(n, Fibonacci.indexOfNearestFibonacciNumber(Fibonacci.fibonacci(n)));
            assertEquals(n, Fibonacci.indexOfNearestFibonacciNumber(Fibonacci.fibonacci(n) + 1));
        }

        assertEquals(70, Fibonacci.indexOfNearestFibonacciNumber(Fibonacci.fibonacci(70)));
        assertEquals(70, Fibonacci.indexOfNearestFibonacciNumber(Fibonacci.fibonacci(70) - 1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void fibonacciNumberMustNotBeNegative() {
        Fibonacci.indexOfNearestFibonacciNumber(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fibonacciNumberMustNotBeTooLarge() {
        Fibonacci.indexOfNearestFibonacciNumber(Fibonacci.fibonacci(70) + 1);
    }
}
