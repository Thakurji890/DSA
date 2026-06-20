package campx;

import java.util.Scanner;

public class removeBracket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String s = sc.next();
            String newStr = "";
            for (char ch : s.toCharArray()) {
                if (ch != '(' && ch != ')') {
                    newStr += ch;
                }
            }
            System.out.println(newStr);
        }
    }
}