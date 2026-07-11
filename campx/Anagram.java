package campx;

public class Anagram {
    // Problem Statement

    // Given two strings s and t, determine if t is an anagram of s.

    // An anagram is a word formed by rearranging the letters of another word, using
    // all the original characters exactly once.
    // Input:
    // s = "listen"
    // t = "silent"

    // Output:
    // true
    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int n = s.length();

        int[] freq = new int[26];

        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0)
                return false;
        }
        return true;
    }
}
