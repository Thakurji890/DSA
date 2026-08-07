package Noukri;

public class DecryptedString {

    // Example: String "aabbbcdcdcd" will be encrypted as "a2b3cd3".
    // If the count of a substring is 1 then also it will be followed by Integer
    // '1'.
    // Example: "aabcdee" will be Encrypted as "a2bcd1e2"
    // Which means it's guaranteed that each substring is followed by some Integer.
    // Also, the frequency of encrypted substring can be of more than one digit. For
    // example, in "ab12c3", ab is repeated 12 times. No leading 0 is present in the
    // frequency of substring.

    // The frequency of a repeated substring can also be in parts.
    // Example: "aaaabbbb" can also have "a2a2b3b1" as Encrypted String.

    public static void main(String[] args) {
        String encrypted1 = "ab2cd2";
        long k1 = 4;
        System.out.println("Output 1: " + findKthChar(encrypted1, k1));

        String encrypted2 = "a2b3cd3";
        long k2 = 8;
        System.out.println("Output 2: " + findKthChar(encrypted2, k2));
    }

    public static char findKthChar(String str, long k) {
        long currLength = 0;
        int n = str.length();
        int i = 0;

        while (i < n) {
            StringBuilder subString = new StringBuilder();
            while (i < n && Character.isLetter(str.charAt(i))) {
                subString.append(str.charAt(i));
                i++;
            }

            long freq = 0;
            while (i < n && Character.isDigit(str.charAt(i))) {
                freq = freq * 10 + (str.charAt(i) - '0');
                i++;
            }

            long len = subString.length();
            long addedLength = len * freq;

            if (k <= currLength + addedLength) {

                long remainingK = k - currLength;

                int charIndex = (int) ((remainingK - 1) % len);

                return subString.charAt(charIndex);
            }

            currLength += addedLength;
        }
        return '-';
    }

}
