package Accenture;

public class PasswordChecker {
    // Write a function CheckPassword(str, n) that accepts a string str of length n.
    // The function should return 1 if the string is a valid password, and 0
    // otherwise.
    // A password is considered valid if it meets all of the following rules:
    // 1. It has a minimum length of 4 characters.
    // 2. It contains at least one numeric digit (0-9).
    // 3. It contains at least one uppercase letter (A-Z).
    // 4. It does not contain any space ( ) or forward slash (/).
    // 5. The first character cannot be a number.

    // Example Test Cases

    // • Input: str = "aA1_67", n = 6 → Output: 1 (Valid)
    // • Input: str = "1aA_67", n = 6 → Output: 0 (Starts with a number)
    // • Input: str = "aA 167", n = 6 → Output: 0 (Contains a space)
    public static void main(String[] args) {
        String password = "aA 167";
        int n = password.length();
        System.out.println(CheckPassword(password, n));
    }

    public static boolean CheckPassword(String password, int n) {
        if (n < 4 || password == null)
            return false;
        if (password.charAt(0) >= '0' && password.charAt(0) <= '9')
            return false;
        boolean hasCap = false;
        boolean hasNum = false;

        for (int i = 0; i < n; i++) {
            char ch = password.charAt(i);
            if (ch == ' ' || ch == '/')
                return false;
            if (ch >= 'A' && ch <= 'Z')
                hasCap = true;
            else if (ch >= '0' && ch <= '9')
                hasNum = true;
        }
        return (hasCap && hasNum);

    }
}
