package Accenture;

public class ReplaceVowels {
    public static void main(String[] args) {
        System.out.println(changeVowelsPosition("Hello"));
    }

    public static String changeVowelsPosition(String str) {
        int left = 0;
        int right = str.length() - 1;
        char[] strArr = str.toCharArray();

        while (left < right) {
            while (left < right && !isVowel(str.charAt(left))) {
                left++;
            }
            while (left < right && !isVowel(str.charAt(right))) {
                right--;
            }
            if (left < right) {
                char ch = strArr[left];
                strArr[left] = strArr[right];
                strArr[right] = ch;
                left++;
                right--;
            }
        }
        return new String(strArr);
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U';
    }
}