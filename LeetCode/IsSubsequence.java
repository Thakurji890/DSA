package LeetCode;

public class IsSubsequence {

    // Given two strings s and t, return true if s is a subsequence of t, or false
    // otherwise.

    // A subsequence
    // of a
    // string is a new
    // string that
    // is formed
    // from the
    // original string
    // by deleting

    // some (can be none) of the characters without disturbing the relative
    // positions of the remaining characters. (i.e., "ace" is a subsequence of
    // "abcde" while "aec" is not).

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        subSequence(s, 0, "");
    }

    public static void subSequence(String s, int indx, String subString) {
        if (indx == s.length()) {
            System.out.println(subString);
            return;
        }

        char ch = s.charAt(indx);
        subSequence(s, indx + 1, subString + ch);
        subSequence(s, indx + 1, subString);
    }

}
