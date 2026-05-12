package TCS;

import java.util.Stack;

public class ValidParenthese {
    public static void main(String[] args) {
        System.out.println(isValid("({(}[)]())"));
    }

    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<Character>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char bracket = stack.pop();
                if ((ch == ')' && bracket != '(')
                        || (ch == '}' && bracket != '{')
                        || (ch == ']' && bracket != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
