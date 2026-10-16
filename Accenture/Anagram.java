package Accenture;

class Anagram {
    public static void main(String[] args) {
        String s1 = "SILENT";
        String s2 = "LISTEN";
        System.out.println(Solution(s1, s2));
    }

    public static boolean Solution(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        int[] count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'A'] = count[s1.charAt(i) - 'A'] + 1;
            count[s2.charAt(i) - 'A'] = count[s2.charAt(i) - 'A'] - 1;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}