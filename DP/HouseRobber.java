package DP;

public class HouseRobber {
    // here is circular house robber
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1 };
        System.out.println(houseRobber(arr));
    }

    public static int houseRobber(int[] arr) {

        int index = arr.length;
        if (index == 1)
            return arr[0];

        int[] temp1 = new int[index - 1];
        int[] temp2 = new int[index - 1];

        for (int i = 0; i < index; i++) {
            if (i != 0)
                temp1[i - 1] = arr[i];
            if (i != index - 1)
                temp2[i] = arr[i];
        }

        return Math.max(optimalSolution(temp1), optimalSolution(temp2));
    }

    public static int optimalSolution(int[] arr) {

        int index = arr.length;

        int prev = arr[0];
        int prev2 = 0;
        for (int i = 1; i < index; i++) {
            int pick = arr[i];
            if (i > 1) {
                pick += prev2;
            }
            int notPick = prev;
            int curr = Math.max(pick, notPick);

            prev2 = prev;
            prev = curr;
        }
        return prev;
    }

}
