package ExamProb;

import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter alphabet : ");
        String s = sc.nextLine();
        sc.close();
        s = s.toLowerCase();
        String newStr = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (newStr.indexOf(ch) == -1) {
                    newStr += ch;
                }
            }
        }
        System.out.println(newStr.length() == 26 ? "Yes" : "No");
        System.out.println(isPow(256));

    }

    public static boolean isPow(int n) {
        if (n <= 0)
            return false;

        return (n & (n - 1)) == 0;
    }
}
