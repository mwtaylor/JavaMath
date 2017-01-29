package com.github.mwtaylor.javamath.fibonacci;

import com.github.mwtaylor.javamath.Fibonacci;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
    @Test
    public void testFibonacciNumbers() {
        assertEquals(0, Fibonacci.fibonacci(0));
        assertEquals(1, Fibonacci.fibonacci(1));
        assertEquals(1, Fibonacci.fibonacci(2));

        long fnMinus1 = 1;
        long fnMinus2 = 1;
        for (int n = 3; n <= 70; n++) {
            long fn = fnMinus1 + fnMinus2;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;

            assertEquals(fn, Fibonacci.fibonacci(n));
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void nMustNotBeNegative() {
        Fibonacci.fibonacci(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void nMustNotBeTooBig() {
        Fibonacci.fibonacci(71);
    }
}
