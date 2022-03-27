package org.calculator;

public class WaterCalculator {
    public long calculateWaterAmount(int[] landscape) {

            if (landscape == null || landscape.length <= 2) return 0;

            for (int i = 0; i < landscape.length; i++) {
                if (landscape[i] < 0) {
                    return 0;
                }
            }

            // finding the maximum height and index
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            for (int i = 0; i < landscape.length; i++) {
                if (landscape[i] > max) {
                    max = landscape[i];
                    maxIndex = i;
                }
            }

            // setting the left edge and moving towards the maximum height
            // and counting water amount, if current height is smaller then left maximum edge
            int leftMax = landscape[0];
            int water = 0;
            for (int i = 1; i < maxIndex; i++) {
                if (landscape[i] > leftMax) {
                    leftMax = landscape[i];
                } else {
                    water += leftMax - landscape[i];
                }
            }

            // doing the same, but moving from right side
            int rightMax = landscape[landscape.length - 1];
            for (int i = landscape.length - 2; i > maxIndex; i--) {
                if (landscape[i] > rightMax) {
                    rightMax = landscape[i];
                } else {
                    water += rightMax - landscape[i];
                }
            }

            return water;
    }
}
