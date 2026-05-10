package TCS;

public class PalindromeNum {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12));
    }

    public static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;
        while (temp > 0) {
            int d = temp % 10;
            rev = rev * 10 + d;
            temp /= 10;
        }
        return rev == num;
    }
}
