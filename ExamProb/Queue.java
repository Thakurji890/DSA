package ExamProb;

public class Queue {
    public static void main(String[] args) {
        QueueOperations var = new QueueOperations();
        var.enQueue(10);
        var.enQueue(20);
        var.enQueue(30);
        var.display();
        System.out.println("Peek Element is : " + var.peek());
        var.deQueue();
        var.deQueue();
        var.display();
        var.deQueue();
        var.display();
    }
}

class Node {
    int data;
    Node next;
}

class QueueOperations {
    Node front = null, rear = null;

    void enQueue(int x) {
        Node node = new Node();
        node.data = x;
        node.next = null;

        if (front == null && rear == null)
            front = rear = node;
        else {
            rear.next = node;
            rear = node;
        }
    }

    int peek() {
        if (front == null && rear == null)
            return -1;
        return front.data;
    }

    void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void deQueue() {
        if (front == null && rear == null) {
            System.out.println("No element is present.");
            return;
        }
        if (front == rear)
            front = rear = null;
        else {
            Node temp = front;
            front = temp.next;
            temp = null;
        }
    }

}
