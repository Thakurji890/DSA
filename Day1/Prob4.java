package Day1;

public class Prob4 {
    public static void main(String[] args) {
        // 1572 LeetCode
        // Add diagonal Data from 2D matrix

        int[][] mat = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // int[][] mat = {
        // { 1, 1, 1, 1 },
        // { 1, 1, 1, 1 },
        // { 1, 1, 1, 1 },
        // { 1, 1, 1, 1 }

        // };

        Solution s = new Solution();
        int result = s.diagonalSum(mat);
        System.out.println("Diagonal Elements Sum is :" + result);

    }
}

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][i];
            sum += mat[i][mat.length - i - 1];
        }
        return sum;
    }
}
