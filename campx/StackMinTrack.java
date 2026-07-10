package campx;

import java.util.Stack;

public class StackMinTrack {
    public static void main(String[] args) {
        MinStack ms = new MinStack();
        String[] operations = {
                "push 2", "push 0", "push 3", "push 0",
                "getMin", "pop", "getMin", "pop", "top", "getMin"
        };

        for (String op : operations) {
            String[] parts = op.split(" ");
            if (parts[0].equals("push")) {
                int value = Integer.parseInt(parts[1]);
                ms.push(value);
                System.out.println("push(" + value + ")");
            } else if (parts[0].equals("pop")) {
                ms.pop();
                System.out.println("pop()");
            } else if (parts[0].equals("top")) {
                System.out.println("top() = " + ms.top());
            } else if (parts[0].equals("getMin")) {
                System.out.println("getMin() = " + ms.getMin());
            }

            System.out.println("Stack : " + ms.stack);
            System.out.println("MinStack : " + ms.minStack);
        }

        // for (String op : operations) {
        // String[] parts = op.split(" ");
        // String operation = parts[0];

        // System.out.println("Operation : " + operation);

        // if (parts.length > 1) {
        // int value = Integer.parseInt(parts[1]);
        // System.out.println("Value: " + value);
        // }

        // System.out.println();
        // }
    }

}

class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.isEmpty())
            return;
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stack.peek();
    }
}
