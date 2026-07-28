package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operation var = new Operation();

        while (true) {
            System.out.print("Insert `-1` to terminate : ");
            int x = sc.nextInt();
            if (x == -1)
                break;
            else
                var.insert(x);
        }
        System.out.print("InOrder traversal \t\t: ");
        var.inOrder(var.root);
        System.out.println();

        System.out.print("PreOrder traversal \t\t: ");
        var.preOrder(var.root);
        System.out.println();

        System.out.print("PostOrder traversal \t\t: ");
        var.postOrder(var.root);
        System.out.println();

        System.out.print("LevelOrder traversal \t\t: ");
        var.levelOrderTraversal(var.root);
        System.out.println();

    }

}

class Operation {
    class Node {
        Node left = null;
        int data;
        Node right = null;
    }

    Node root = null;

    void insert(int x) {
        Node node = new Node();
        node.data = x;

        if (root == null)
            root = node;
        else {
            Node temp = root;

            while (true) {
                if (x < temp.data) {
                    if (temp.left == null) {
                        temp.left = node;
                        break;
                    } else
                        temp = temp.left;
                } else {
                    if (temp.right == null) {
                        temp.right = node;
                        break;
                    } else
                        temp = temp.right;
                }
            }
        }
    }

    void inOrder(Node temp) {
        if (temp != null) {
            inOrder(temp.left);
            System.out.print(temp.data + " ");
            inOrder(temp.right);
        }
    }

    void preOrder(Node temp) {
        if (temp != null) {
            System.out.print(temp.data + " ");
            preOrder(temp.left);
            preOrder(temp.right);
        }
    }

    void postOrder(Node temp) {
        if (temp != null) {
            postOrder(temp.left);
            postOrder(temp.right);
            System.out.print(temp.data + " ");
        }
    }

    void levelOrderTraversal(Node temp) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if (root == null)
            return;
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new ArrayList<>();
            for (int i = 0; i < levelNum; i++) {
                if (queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if (queue.peek().right != null)
                    queue.offer(queue.peek().right);
                subList.add(queue.poll().data);
            }
            list.add(subList);
        }

        for (List<Integer> node : list) {
            System.out.print(node + " ");
        }

    }

}
