package DSA;

public class BackTracking {
    public static void printPer(String str, String per) {
        if (str.length() == 0) {
            System.out.println(per);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPer(newStr, per + ch);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        printPer(str, "");
    }
}
