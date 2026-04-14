
// import java.util.Scanner;

public class Stack {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size of ");
        // int n = sc.nextInt();

        StackOperation var = new StackOperation();
        var.push(10);
        var.push(20);
        var.display();
        var.pop();
        var.display();
        System.out.println(var.peek());
        ;

    }

}

class StackOperation {
    int[] stack = new int[5];
    int top = -1;

    public void push(int x) {
        if (top == stack.length - 1) {
            System.out.println("\nStack Overflow");
            return;
        }
        stack[++top] = x;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("\nStack underflow");
            return;
        }
        top--;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("\nStack is Empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public void display() {
        if (top == -1) {
            System.out.println("\nStack is Empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            if (i == 0)
                System.out.print(stack[i]);
            else
                System.out.print(stack[i] + "->");
        }

    }
}
