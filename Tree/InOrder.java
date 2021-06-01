package Tree;

import java.util.Stack;

public class InOrder {
    public static void main(String[] args) {
        BinaryTreee bt = new BinaryTreee();

        bt.root = new Nodee(5);

        bt.root.left = new Nodee(4);
        bt.root.left.left = new Nodee(11);
        bt.root.left.left.left = new Nodee(7);
        bt.root.left.left.right = new Nodee(2);

        bt.root.right = new Nodee(8);
        bt.root.right.left = new Nodee(13);
        bt.root.right.right = new Nodee(4);
        bt.root.right.right.right = new Nodee(1);

        bt.inOrderTraversal(bt.root);

        while (bt.hasNext()) {
            System.out.print(bt.next() + " ");
        }

        // bt.inOrd(bt.root);

    }
}

class Nodee {
    int val;
    Nodee left, right;

    Nodee(int data) {
        this.val = data;
        left = right = null;
    }
}

class BinaryTreee {
    Nodee root;
    Stack<Nodee> stack = new Stack<>();

    void inOrderTraversal(Nodee node) {

        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    boolean hasNext() {
        if (!stack.empty()) {
            return true;
        }
        return false;
    }

    int next() {

        Nodee node = stack.pop();
        int val_toReturn = node.val;

        if (node.right != null) {
            node = node.right;

            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }

        return val_toReturn;
    }

}