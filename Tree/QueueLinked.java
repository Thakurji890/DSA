package Tree;

public class QueueLinked {
    public static void main(String[] args) {
        QueueOperatios var = new QueueOperatios();
        var.enQueue(10);
        var.enQueue(20);
        var.enQueue(30);
        var.display();
        var.deQueue();
        var.display();
    }

}

class Node {
    int data;
    Node next;
}

class QueueOperatios {
    Node front = null, rear = null;

    public void enQueue(int x) {
        Node node = new Node();
        node.data = x;
        node.next = null;

        if (rear == null) {
            front = rear = node;
            return;
        }
        rear.next = node;
        rear = node;
    }

    public void deQueue() {
        if (front == null)
            return;
        Node temp = front;
        front = front.next;
        temp.next = null;

        if (front == null)
            rear = null;
    }

    public void display() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("Null\n");
    }
}
