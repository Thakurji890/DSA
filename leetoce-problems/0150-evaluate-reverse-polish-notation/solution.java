class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int rightSub = stack.pop();
                    int leftSub = stack.pop();
                    stack.push(leftSub - rightSub);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int rightDiv = stack.pop();
                    int leftDiv = stack.pop();
                    stack.push(leftDiv / rightDiv);
                    break;
                default:
                    int number = Integer.parseInt(token);
                    stack.push(number);
                    break;
            }
        }
        return stack.pop();
    }
}
