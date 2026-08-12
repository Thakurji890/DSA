class MinStack {
    private class Node {
        int value;
        int min;
        Node next;

        private Node(int value, int min, Node next) {
            this.value = value;
            this.min = min;
            this.next = next;
        }
    }

    private Node head;

    public MinStack() {
        head = null;
    }

    public void push(int value) {
        if (head == null)
            head = new Node(value, value, null);
        else {
            int currMin = Math.min(value, head.min);
            head = new Node(value, currMin, head);
        }
    }

    public void pop() {
        if (head != null)
            head = head.next;
    }

    public int top() {
        return head.value;
    }

    public int getMin() {
        return head.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
