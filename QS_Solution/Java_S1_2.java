package QS_Solution;

// Java - 2
public class Java_S1_2 {
    public static void main(String[] args) {
        Solution var = new Solution();

        // Q1.
        var.printPattern(3);

    }

}

class Solution {
    // Question - 1
    void printPattern(int n) {
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == 1 || j == 1 || i == n || j == n)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Input");
        }
    }

}
