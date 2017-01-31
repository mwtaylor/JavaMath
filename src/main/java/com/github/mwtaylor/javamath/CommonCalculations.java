package com.github.mwtaylor.javamath;

import java.util.Arrays;

public class CommonCalculations {
    private CommonCalculations() {}

    /**
     * Calculates the sum of the first natural numbers, from 1 to max
     * @param max The highest number to include in the sum
     * @return The sum of the natural numbers
     */
    public static int sumOfFirstNaturalNumbers(int max) {
        if (max < 0) {
            throw new IllegalArgumentException("The max must be a positive number");
        }

        return (max * (max + 1)) / 2;
    }

    /**
     * Calculates the greatest common divisor of two numbers
     * @param n1 The first number to find a common divisor for
     * @param n2 The second number to find a common divisor for
     * @return The GCD
     */
    public static int greatestCommonDivisor(int n1, int n2) {
        if (n1 < 0 || n2 < 0) {
            throw new IllegalArgumentException("The argument must be greater than or equal to zero");
        }

        if (n1 == 0) {
            return n2;
        }
        if (n2 == 0) {
            return n1;
        }

        return greatestCommonDivisor(n2, n1 % n2);
    }

    /**
     * Finds all prime factors of a number
     * @param n The number to find prime factors of
     * @return The list of prime factors, in order from smallest to largest
     */
    public static long[] primeFactors(long n) {
        if (n < 1) {
            throw new IllegalArgumentException("Can only find prime factors for non-zero positive number");
        }

        long[] factors = new long[64];
        int factorCount = 0;

        long remaining = n;

        while (remaining % 2 == 0) {
            factors[factorCount] = 2;
            factorCount += 1;

            remaining = remaining / 2;
        }

        long lastCheck = Math.round(Math.sqrt(remaining));

        for (long i = 3; i <= lastCheck; i += 2) {
            while (remaining % i == 0) {
                factors[factorCount] = i;
                factorCount += 1;

                remaining = remaining / i;

                lastCheck = Math.round(Math.sqrt(remaining));
            }
        }

        if (remaining != 1) {
            factors[factorCount] = remaining;
            factorCount += 1;
        }

        return Arrays.copyOf(factors, factorCount);
    }
}
