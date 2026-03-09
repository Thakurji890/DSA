package DSA;

import java.util.HashSet;

public class RecursionADV {
    public static void main(String[] args) {
        // String str = "abaacdaefaah";
        // firstLastOcc(str, 0, 'a');

        // int[] arr = { 1, 2, 3, 4, 6 };
        // System.out.println(isSorted(arr, 0));

        // String str = "axbcxxd";
        // char ch = 'x';
        // addAtEnd(str, 0, 0, ch, "");

        // String str = "abc";
        // removeDuplicates(str, 0, "");

        // subSquence(str, 0, "");

        // HashSet<String> set = new HashSet<>();
        // subSeq(str, 0, "", set);
        String str = "0";
        printComb(str, 0, "");
    }

    public static int first = -1, last = -1;

    public static void firstLastOcc(String str, int idx, char character) {
        if (str.length() == idx) {
            System.out.print("First Occurance : " + first + " Second Occurance : " + last);
            return;
        }
        char currentChar = str.charAt(idx);
        if (currentChar == character) {
            if (first == -1)
                first = idx;
            else
                last = idx;
        }
        firstLastOcc(str, idx + 1, character);
    }

    public static boolean isSorted(int[] arr, int idx) {
        if (idx == arr.length - 1)
            return true;
        if (arr[idx] < arr[idx + 1])
            return isSorted(arr, idx + 1);
        else
            return false;
    }

    public static void addAtEnd(String str, int idx, int count, char ch, String strNew) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                strNew += ch;
            }
            System.out.println(strNew);
            return;
        }
        char character = str.charAt(idx);
        if (character == ch) {
            count++;
            addAtEnd(str, idx + 1, count, ch, strNew);
        } else {
            strNew += character;
            addAtEnd(str, idx + 1, count, ch, strNew);
        }
    }

    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newStr) {
        if (str.length() == idx) {
            System.out.println("New String without duplicates : " + newStr);
            return;
        }
        char ch = str.charAt(idx);
        if (map[ch - 'a']) {
            removeDuplicates(str, idx + 1, newStr);
        } else {
            newStr += ch;
            map[ch - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr);
        }
    }

    public static void subSquence(String str, int idx, String newStr) {
        if (str.length() == idx) {
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(idx);
        // to be
        subSquence(str, idx + 1, newStr + ch);
        // to not be
        subSquence(str, idx + 1, newStr);
    }

    public static void subSeq(String str, int idx, String newStr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newStr))
                return;
            else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char ch = str.charAt(idx);

        subSeq(str, idx + 1, newStr + ch, set);

        subSeq(str, idx + 1, newStr, set);
    }

    public static String[] mapString = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printComb(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char ch = str.charAt(idx);
        String mapping = mapString[ch - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx + 1, combination + mapping.charAt(i));
        }
    }
}
