public class Queue {
    public static void main(String[] args) {
        QueueOperations var = new QueueOperations();
        var.enQueue(10);
        var.enQueue(20);
        var.display();
        var.deQueue();
        var.display();
        var.enQueue(30);
        System.out.println("\nFront : " + var.front + "Rear : " + var.rear());
    }

}

class QueueOperations {
    int[] Queue = new int[5];
    int front = -1, rear = -1;

    public void enQueue(int x) {
        if (rear == Queue.length - 1) {
            System.out.println("Queue is Full");
            return;
        }
        Queue[++rear] = x;
        front = 0;
    }

    public void deQueue() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        front++;
    }

    public int front() {
        return front;
    }

    public int rear() {
        return rear;
    }

    public void display() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            if (i == rear)
                System.out.print(Queue[i]);
            else
                System.out.print(Queue[i] + "->");
        }
        System.out.println();
    }

}
