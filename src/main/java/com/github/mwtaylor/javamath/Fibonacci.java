package com.github.mwtaylor.javamath;

public class Fibonacci {
    private Fibonacci() {}

    private static final double PHI = (1 + Math.sqrt(5)) / 2;

    private static final int HIGHEST_FIBONACCI_INDEX = 70;
    private static final long HIGHEST_FIBONACCI_NUMBER = fibonacci(HIGHEST_FIBONACCI_INDEX);

    /**
     * Finds the nth Fibonacci number where f(0) = 0, f(1) = 1, f(2) = 1, f(3) = 2, ...
     * @param n The Fibonacci number to find
     * @return The requested number in the Fibonacci sequence
     */
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a positive number or zero");
        }
        if (n > HIGHEST_FIBONACCI_INDEX) {
            throw new IllegalArgumentException("n is too big to accurately calculate the Fibonacci number");
        }

        return Math.round((Math.pow(PHI, n) - Math.pow(1 - PHI, n)) / Math.sqrt(5));
    }

    /**
     * Finds the closest Fibonacci number to the given number
     * @param fn The number to use when finding the closest number in the Fibonacci sequence
     * @return The index of the closest Fibonacci number
     */
    public static int indexOfNearestFibonacciNumber(long fn) {
        if (fn < 0) {
            throw new IllegalArgumentException("Can't find the index for a negative Fibonacci number");
        }
        if (fn > HIGHEST_FIBONACCI_NUMBER) {
            throw new IllegalArgumentException("The number given is too large to accurately calculate");
        }

        return (int) Math.round(Math.floor(Math.log(fn * Math.sqrt(5)) / Math.log(PHI) + 0.5));
    }
}
