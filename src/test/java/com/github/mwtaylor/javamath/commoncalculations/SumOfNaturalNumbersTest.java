package com.github.mwtaylor.javamath.commoncalculations;

import com.github.mwtaylor.javamath.CommonCalculations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfNaturalNumbersTest {
    @Test
    public void testSums() {
        assertEquals(1, CommonCalculations.sumOfFirstNaturalNumbers(1));
        assertEquals(3, CommonCalculations.sumOfFirstNaturalNumbers(2));
        assertEquals(6, CommonCalculations.sumOfFirstNaturalNumbers(3));
        assertEquals(21, CommonCalculations.sumOfFirstNaturalNumbers(6));

        assertEquals(0, CommonCalculations.sumOfFirstNaturalNumbers(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void sumsCanOnlyBeCalculatedForPositiveMax() {
        CommonCalculations.sumOfFirstNaturalNumbers(-1);
    }
}
