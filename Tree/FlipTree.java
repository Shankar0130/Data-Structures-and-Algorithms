package Tree;

import java.util.Stack;

class Nod {
    int val;
    Nod left, right;

    Nod(int data) {
        this.val = data;
        left = right = null;
    }
}

class BinaryTre {
    Nod root;
    Stack<Nod> stack = new Stack<>();

    void flipTree(Nod node) {
        if (node == null) {
            return;
        }

        Nod temp = node.left;
        node.left = node.right;
        node.right = temp;
        flipTree(node.left);
        flipTree(node.right);

    }

    void inOrder(Nod node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    int next() {
        Nod node = stack.pop();
        int res = node.val;

        if (node.right != null) {
            node = node.right;

            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }

        return res;
    }

    boolean hasNext() {
        return !stack.empty();
    }

    void print(Nod node) {
        inOrder(node);
        while (hasNext()) {
            System.out.print(next() + " ");
        }
    }

}

class FlipTree {

    public static void main(String[] args) {
        BinaryTre bt = new BinaryTre();

        bt.root = new Nod(10);

        bt.root.left = new Nod(5);
        bt.root.right = new Nod(20);
        bt.root.left.left = new Nod(2);
        bt.root.left.right = new Nod(7);

        bt.root.left.left.left = new Nod(1);
        bt.root.left.left.right = new Nod(3);

        bt.root.right.left = new Nod(12);
        bt.root.right.right = new Nod(30);

        bt.print(bt.root);
        System.out.println();
        bt.flipTree(bt.root);
        bt.print(bt.root);
    }
}
