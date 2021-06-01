package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    static class Node {
        int val;
        Node left, right;

        Node(int data) {
            this.val = data;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;
        Queue<Node> queue = new LinkedList<>();

        void levelOrder(Node node) {
            queue.add(node);
            queue.add(null);
            insert();
        }

        void insert() {

            while (!queue.isEmpty()) {
                Node node = queue.remove();

                if (node != null) {
                    System.out.print(node.val + " ");
                    if (node.left != null) {
                        queue.add(node.left);
                    }

                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }

                if (node == null && !queue.isEmpty()) {
                    queue.add(null);
                    System.out.println();
                }

            }

        }

    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.root = new Node(10);
        bt.root.left = new Node(5);
        bt.root.right = new Node(20);
        bt.root.left.left = new Node(2);
        bt.root.left.right = new Node(7);

        bt.root.left.left.left = new Node(40);
        bt.root.left.left.right = new Node(41);
        bt.root.left.right.left = new Node(42);
        bt.root.left.right.right = new Node(43);

        bt.root.right.left = new Node(31);
        bt.root.right.right = new Node(30);

        bt.root.right.left.left = new Node(34);
        bt.root.right.left.right = new Node(35);

        bt.root.right.right.left = new Node(32);
        bt.root.right.right.right = new Node(33);

        bt.levelOrder(bt.root);

    }
}
