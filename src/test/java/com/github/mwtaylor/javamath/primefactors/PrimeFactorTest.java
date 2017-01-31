package com.github.mwtaylor.javamath.primefactors;

import com.github.mwtaylor.javamath.CommonCalculations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeFactorTest {
    @Test
    public void factorLargeNumber() {
        long numberToFactor = 514229L * 13L * 487L * 991L;
        long[] result = CommonCalculations.primeFactors(numberToFactor);
        assertEquals(4, result.length);
        assertEquals(13, result[0]);
        assertEquals(487, result[1]);
        assertEquals(991, result[2]);
        assertEquals(514229, result[3]);
    }

    @Test
    public void factorNumberWithMultipleLargeFactors() {
        long numberToFactor = 3276509L * 94418953L;
        long[] result = CommonCalculations.primeFactors(numberToFactor);
        assertEquals(2, result.length);
        assertEquals(3276509, result[0]);
        assertEquals(94418953, result[1]);
    }

    @Test
    public void factorLargePrimeNumber() {
        long numberToFactor = 688846502588399L;
        long[] result = CommonCalculations.primeFactors(numberToFactor);
        assertEquals(1, result.length);
        assertEquals(688846502588399L, result[0]);
    }

    @Test
    public void factorNumberWithRepeatedFactors() {
        long numberToFactor = 2 * 2 * 2 * 5 * 5 * 13 * 109 * 109;
        long[] result = CommonCalculations.primeFactors(numberToFactor);
        assertEquals(8, result.length);
        assertEquals(2, result[0]);
        assertEquals(2, result[1]);
        assertEquals(2, result[2]);
        assertEquals(5, result[3]);
        assertEquals(5, result[4]);
        assertEquals(13, result[5]);
        assertEquals(109, result[6]);
        assertEquals(109, result[7]);
    }

    @Test
    public void oneHasNoPrimeFactors() {
        assertEquals(0, CommonCalculations.primeFactors(1).length);
    }

    @Test(expected = IllegalArgumentException.class)
    public void primeFactorsCantBeFoundForZero() {
        CommonCalculations.primeFactors(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void primeFactorsCantBeFoundForNegativeNumbers() {
        CommonCalculations.primeFactors(-1);
    }
}
