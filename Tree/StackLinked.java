package Tree;

public class StackLinked {

    public static void main(String[] args) {
        StackOperations var = new StackOperations();
        var.push(10);
        var.push(20);
        var.push(30);
        var.push(40);
        var.push(50);
        var.push(60);
        var.display();
        var.pop();
        System.out.println();
        var.display();

    }

}

class Node {
    int value;
    Node next;
}

class StackOperations {
    Node head = null;

    public void push(int x) {
        Node node = new Node();
        node.value = x;
        node.next = null;

        node.next = head;
        head = node;

    }

    public void pop() {
        if (head == null) {
            System.out.println("Stack is underflow");
            return;
        }
        Node temp = head;
        head = temp.next;
        temp.next = null;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }
}
