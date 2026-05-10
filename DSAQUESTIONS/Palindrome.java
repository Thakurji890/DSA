package DSAQUESTIONS;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("MAA"));
    }

    public static boolean isPalindrome(String str) {
        if (str.length() == 0)
            return true;
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right))
                return false;
            left++;
            right--;

        }
        return true;
    }

}
