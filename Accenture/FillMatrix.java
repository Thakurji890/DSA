package Accenture;

public class FillMatrix {
    public static void main(String[] args) {
        String s = "aaaabbbcc";
        System.out.println(Solution(s));
    }

    public static int Solution(String s) {
        int n = (int) Math.sqrt(s.length());
        int[][] matrix = new int[n][n];

        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = s.charAt(index++);
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean isUniform = true;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i][0]) {
                    isUniform = false;
                    break;
                }
            }
            if (isUniform) {
                count++;
            }
        }

        for (int i = 0; i < n; i++) {
            boolean isUniform = true;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[0][j]) {
                    isUniform = false;
                    break;
                }
            }
            if (isUniform) {
                count++;
            }
        }
        return count;
    }

}
