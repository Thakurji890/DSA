package Accenture;

public class StringBinary {

    // Problem Statement:
    // You are given a binary string consisting of 0s and 1s separated by uppercase
    // alphabets acting as operators:
    // • A denotes a bitwise AND operation.
    // • B denotes a bitwise OR operation.
    // • C denotes a bitwise XOR operation.
    // Scan the string from left to right, compute the result taking one operation
    // at a time, and return the final integer (1 or 0). If the string is empty or
    // null, return -1.
    // • Input: "1C0C1C1A0B1"
    // • Output: 1
    // • Explanation: ((((1 XOR 0) XOR 1) XOR 1) AND 0) OR 1 results in 1.
    public static void main(String[] args) {
        String str = "1C0C1C1A0B1";

        System.out.println(Solution(str));

    }

    public static int Solution(String str) {
        if (str.length() == 0 || str == null)
            return -1;
        int res = str.charAt(0) - '0';

        for (int i = 1; i < str.length(); i += 2) {
            char op = str.charAt(i);
            int nextVal = str.charAt(i + 1) - '0';

            if (op == 'A')
                res = res & nextVal;
            else if (op == 'B')
                res = res | nextVal;
            else if (op == 'C')
                res = res ^ nextVal;
        }
        return res;

    }

}
