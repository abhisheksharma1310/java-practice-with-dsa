package DSA.Arrays;

public class TrappingRainwater {
    public static void trappedRainWater(int height[]) {
        // size
        int n = height.length;
        int trappedWater = 0;

        // calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max boundary - array
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        // loop
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightmax[i]);
            // trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        // print total trapped water
        System.out.println("Total trapped water: " + trappedWater);
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        trappedRainWater(height);
    }
}
