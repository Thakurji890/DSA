package DP;

public class ClimbStairs {
    // either you can jump 1 step or 2 step
    public static void main(String[] args) {
        int n = 3;
        System.out.println(jump(n));
    }

    public static int jump(int n) {
        if (n == 0 || n == 1)
            return 1;

        int left = jump(n - 1);
        int right = jump(n - 2);
        return left + right;
    }

}
