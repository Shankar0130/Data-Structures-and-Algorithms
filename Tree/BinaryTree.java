package Tree;

import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    ArrayList<Integer> ar = new ArrayList<>();

    BinaryTree() {
        if (ar.size() == 0) {
            ar.add(-1);
        }
    }

    // Function to print all non-root nodes
    // that don't have a sibling
    ArrayList<Integer> printSingles(Node node) {
        // Base case
        if (node == null) {

            return ar;
        }

        // If this is an internal node, recur for left
        // and right subtrees
        if (node.left != null && node.right != null) {
            printSingles(node.left);
            printSingles(node.right);
        }

        // If left child is NULL and right
        // is not, print right child
        // and recur for right child
        else if (node.right != null) {
            ar.add(node.right.data);
            // System.out.print(node.right.data + " ");
            printSingles(node.right);
        }

        // If right child is NULL and left
        // is not, print left child
        // and recur for left child
        else if (node.left != null) {
            ar.add(node.left.data);
            // System.out.print(node.left.data + " ");
            printSingles(node.left);
        }

        return ar;

    }

    // Driver program to test the above functions
    public static void main(String args[]) {
        BinaryTree tree_one = new BinaryTree();

        /*
         * Let us construct the tree shown in above diagram
         */
        tree_one.root = new Node(1);
        tree_one.root.left = new Node(2);
        tree_one.root.right = new Node(3);
        tree_one.root.left.right = new Node(4);
        tree_one.root.right.left = new Node(5);
        tree_one.root.right.left.right = new Node(6);
        tree_one.printSingles(tree_one.root);

        System.out.println(tree_one.ar);

        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.printSingles(tree.root);

        System.out.println(tree.ar);
    }
}
