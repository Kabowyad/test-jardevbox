package org.calculator;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;

public class WaterCalculatorTest extends TestCase {

    public WaterCalculator waterCalculator = new WaterCalculator();

    @Test
    public void testShouldReturnZeroEmptyInput() {
        int[] empty = new int[0];
        long emptyRes = waterCalculator.calculateWaterAmount(empty);
        Assert.assertEquals(0, emptyRes);

        long nullRes = waterCalculator.calculateWaterAmount(null);
        Assert.assertEquals(0, nullRes);

        int[] negative = {1,2,-1,1};
        long negativeRes = waterCalculator.calculateWaterAmount(negative);
        Assert.assertEquals(0, negativeRes);
    }

    @Test
    public void testWorkingScenaries() {
        int[] first = {2,1,2};
        long firstRes = waterCalculator.calculateWaterAmount(first);
        Assert.assertEquals(1, firstRes);

        int[] second = {5,2,3,4,5,4,0,3,1};
        long secondRes = waterCalculator.calculateWaterAmount(second);
        Assert.assertEquals(9, secondRes);

        int[] third = {0,0,0};
        long thirdRes = waterCalculator.calculateWaterAmount(third);
        Assert.assertEquals(0, thirdRes);

        int[] fourth = {2,5,1,3,1,3,1,5,2};
        long fourthRes = waterCalculator.calculateWaterAmount(fourth);
        Assert.assertEquals(16, fourthRes);
    }

}
