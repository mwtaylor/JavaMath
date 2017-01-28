package com.github.mwtaylor.javamath.commoncalculations;

import com.github.mwtaylor.javamath.CommonCalculations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDivisorTest {
    @Test
    public void calculateGreatestCommonDivisor() {
        assertEquals(3, CommonCalculations.greatestCommonDivisor(3, 9));
        assertEquals(3, CommonCalculations.greatestCommonDivisor(9, 3));

        assertEquals(2, CommonCalculations.greatestCommonDivisor(4, 6));
        assertEquals(2, CommonCalculations.greatestCommonDivisor(6, 4));

        assertEquals(2, CommonCalculations.greatestCommonDivisor(2, 2));

        assertEquals(2, CommonCalculations.greatestCommonDivisor(2, 0));
        assertEquals(2, CommonCalculations.greatestCommonDivisor(0, 2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void firstNumberMustNotBeNegative() {
        CommonCalculations.greatestCommonDivisor(-1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void secondNumberMustNotBeNegative() {
        CommonCalculations.greatestCommonDivisor(2, -1);
    }
}
