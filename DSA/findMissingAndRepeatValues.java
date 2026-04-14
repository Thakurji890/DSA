package DSA;

public class findMissingAndRepeatValues {
    public static void main(String[] args) {
        int[][] grid = { { 9, 1, 7 }, { 8, 9, 2 }, { 3, 4, 6 } };
        Solution var = new Solution();
        int[] arr = var.findMissingAndRepeatValues(grid);
        System.out.print("[ ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.print(" ]");
    }
}

class Solution {
    public int[] findMissingAndRepeatValues(int[][] grid) {
        int n = grid.length;
        int size = n * n;
        int[] freq = new int[size + 1];

        for (int[] row : grid) {
            for (int num : row) {
                freq[num]++;
            }
        }
        int repeated = -1, missing = -1;
        for (int i = 1; i <= size; i++) {
            if (freq[i] == 2)
                repeated = i;
            if (freq[i] == 0)
                missing = i;
        }

        return new int[] { repeated, missing };
    }
}
