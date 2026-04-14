package Day2;

import java.util.Arrays;

public class prob1 {
    public static void main(String[] args) {

        // String s = "Hello World";
        // int result = prob1.lastLength(s);
        // System.out.println("Length of Last word is : " + result);

        // String[] strs = { "flower", "flow", "flight" };
        // String result = prob1.commonPrefix(strs);
        // System.out.println("Longest Common Prefix : " + result);

        // System.out.println("Strs.length : " + strs.length);
        // System.out.println("Strs[i].length : " + strs[0].charAt(0));

        int n = prob1.strStr("sadbutsad", "sad");
        System.out.println("Index at : " + n);
    }

    // LeetCode 58
    public static int lastLength(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ')
                count++;

            else if (count > 0)
                return count;

        }
        return count;
    }

    // LeetCode 14
    public static String commonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i])
                break;
            res.append(first[i]);
        }
        return res.toString();
    }

    // LeetCode 459
    public static boolean repeatSubstring(String s) {
        String doubled = s + s;
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }

    // LeetCode 28
    public static int strStr(String str, String subStr) {
        if (subStr.length() == 0) {
            return 0;
        }
        for (int i = 0; i <= str.length() - subStr.length(); i++) {
            boolean found = true;
            for (int j = 0; j < subStr.length(); j++) {
                if (str.charAt(i + j) != subStr.charAt(j)) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;

        // for (int i = 0; i < str.length() - subStr.length(); i++) {
        // if(str.substring(i,subStr.length()+i).equals(subStr))
        // return i;
        // }
        // return -1;
    }
}
