package LinkedList;

public class Stack {
    public static void main(String[] args) {
        StackOperation stack = new StackOperation();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();

        stack.push(60);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.display();

        stack.peek();
        stack.stackSize();
        stack.pop();
        stack.pop();

        if (stack.isFull() == 1)
            System.out.println("Stack is FULL\n");
        else
            System.out.println("Stack is NOT FULL\n");

        if (stack.isEmpty() == 1)
            System.out.println("Stack is EMPTY\n");
        else
            System.out.println("Stack is NOT EMPTY\n");

    }
}

class StackOperation {
    int N = 5;
    int[] stack = new int[N];
    int top = -1;

    void push(int x) {
        if (top == N - 1)
            System.out.println("Stack Overflow\n");
        else
            stack[++top] = x;
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow\n");
        else
            top--;
    }

    void peek() {
        if (top == -1)
            System.out.println("Stack is EMPTY\n");
        else
            System.out.println("Top element : " + stack[top] + "\n");
    }

    int isFull() {
        if (top == N - 1)
            return 1;
        return 0;
    }

    int isEmpty() {
        if (top == -1)
            return 1;
        return 0;
    }

    void stackSize() {
        System.out.println("Stack Count : " + (top + 1) + "\n");
    }

    void display() {
        for (int i = top; i >= 0; i--)
            System.out.print(stack[i] + " ");

        System.out.println("\n");
    }
}