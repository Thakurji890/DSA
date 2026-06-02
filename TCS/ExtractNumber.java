package TCS;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumber {
    public static void main(String[] args) {
        String input = "abc123def456";
        extractFull(input);
        lineByLine(input);
        firstNumber(input);
        loopMethod(input);
    }

    public static void extractFull(String str) {
        String digiOnly = str.replaceAll("\\D+", "");
        System.out.println(digiOnly);
    }

    public static void lineByLine(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());

    }

    public static void firstNumber(String str) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            String fisrtNumStr = matcher.group();
            int firstNumber = Integer.parseInt(fisrtNumStr);

            System.out.println(firstNumber);
        } else {
            System.out.println("Number not found");
        }
    }

    public static void loopMethod(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                sb.append(ch);
            } else if (sb.length() > 0) {
                break;
            }
        }
        if (sb.length() > 0) {
            System.out.println(sb.toString());
        }
    }
}