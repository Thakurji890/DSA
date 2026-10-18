package Accenture;

public class PsuedoCode {
    public static void main(String[] args) {

        // Count ones in any number
        System.out.println(Solution(11));
        System.out.println(Solution2(11));
    }

    public static int Solution(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n << 1;
        }
        return count;
    }

    // Solution 2
    public static int Solution2(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

}
