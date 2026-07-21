package DP;

// contains obsatcles
public class DPGrids2 {

    // move (0,0) to (m - 1 , n - 1) with obstacles
    public static void main(String[] args) {
        int[][] mat = {
                { 0, 0, 0 },
                { 0, -1, 0 },
                { 0, 0, 0 }
        };

        System.out.println(sortPathRecursion(mat.length - 1, mat[0].length - 1, mat));
    }

    public static int sortPathRecursion(int i, int j, int[][] mat) {
        if (i >= 0 && j >= 0 && mat[i][j] == -1)
            return 0;
        if (i == 0 && j == 0)
            return 1;
        if (i < 0 || j < 0)
            return 0;

        int upPath = sortPathRecursion(i - 1, j, mat);
        int leftPath = sortPathRecursion(i, j - 1, mat);

        return upPath + leftPath;
    }

    // same memoziation
}
