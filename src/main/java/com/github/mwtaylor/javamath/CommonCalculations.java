package com.github.mwtaylor.javamath;

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
}
