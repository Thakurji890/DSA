package TCS;

public class SetMatrixZero {
    public static int[][] mat = { { 1, 1, 1, 1 }, { 1, 0, 0, 1 }, { 1, 1, 0, 1 }, { 1, 1, 1, 1 } };

    public static void main(String[] args) {
        int n = mat.length;
        int m = mat[0].length;
        brute(mat, n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void brute(int[][] mat, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    markRow(i, m);
                    markCol(j, n);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == -1) {
                    mat[i][j] = 0;
                }
            }
        }
    }

    public static void markRow(int i, int m) {
        for (int j = 0; j < m; j++) {
            if (mat[i][j] != 0) {
                mat[i][j] = -1;
            }
        }
    }

    public static void markCol(int j, int n) {
        for (int i = 0; i < n; i++) {
            if (mat[i][j] != 0) {
                mat[i][j] = -1;
            }
        }
    }
}
