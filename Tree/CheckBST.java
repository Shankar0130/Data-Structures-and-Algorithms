package Tree;

public class CheckBST {

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

        Node prev = null;

        boolean isBST(Node node) {
            // code here.

            if (node != null) {
                if (!isBST(node.left))
                    return false;

                // allows only distinct values node
                if (prev != null && node.val <= prev.val)
                    return false;
                prev = node;
                return isBST(node.right);
            }
            return true;

        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.root = new Node(2);
        bt.root.left = new Node(1);
        bt.root.left.left = new Node(0);
        bt.root.left.right = new Node(3);
        bt.root.right = new Node(3);

        System.out.println(bt.isBST((bt.root)));
    }
}
