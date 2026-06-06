package campx;

// Q --->   Trapping Rainwater
// Gien n non - negative integers repesenting an elevation map 
// where the width of each bar is 1, compute how much water
//  it can trap after raining
// 

public class TrappingWater {
    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainwater(height));
    }

    public static int trappedRainwater(int[] arr) {
        // left max boundary
        int[] leftMax = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        // right max boundary

        int[] rightMax = new int[arr.length];
        rightMax[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        // loop
        int trappedWater = 0;
        for (int i = 0; i < arr.length; i++) {
            // waterlevel = min(leftmax bound , rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterlevel - height[i]
            trappedWater += waterLevel - arr[i];
        }
        return trappedWater;
    }
}
