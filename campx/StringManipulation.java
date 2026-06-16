package campx;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String newStr = "";

        for (char ch : str.toCharArray()) {
            if (!isVowel(ch)) {
                newStr += ".";
                newStr += ch;
            }
        }
        System.out.println(newStr);
    }

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
