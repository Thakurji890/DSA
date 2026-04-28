package DSAQUESTIONS;

import java.util.Scanner;

public class NormalizedConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch) && !"aeiou".contains(String.valueOf(ch))) {
                System.out.print("." + ch);
            }
        }
    }

}
