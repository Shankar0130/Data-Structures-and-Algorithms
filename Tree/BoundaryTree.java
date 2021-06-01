package Tree;

public class BoundaryTree {
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        void boundaryPrint(Node node) {

            if (node != null) {
                System.out.print(node.val + " ");
                leftPrint(node.left);
                leafPrint(node);
                rightPrint(node.right);
            }
        }

        void makeBinaryTree(int[] arr, Node node, int i) {

            if (i < arr.length) {
                node.left = new Node(arr[i]);
                i = i + 1;
                node.right = new Node(arr[i]);
                i = i + 1;

                if (i < arr.length / 2) {

                }
            }
        }

        void leftPrint(Node node) {

            if (node != null) {
                if (node.left != null) {
                    System.out.print(node.val + " ");
                    leftPrint(node.left);
                } else if (node.right != null) {
                    System.out.print(node.val + " ");
                    leftPrint(node.right);
                }
            }
        }

        void rightPrint(Node node) {

            if (node != null) {
                if (node.right != null) {
                    rightPrint(node.right);
                    System.out.print(node.val + " ");
                } else if (node.left != null) {
                    rightPrint(node.left);
                    System.out.print(node.val + " ");
                }
            }
        }

        void leafPrint(Node node) {
            if (node != null) {

                leafPrint(node.left);

                if (node.left == null && node.right == null) {
                    System.out.print(node.val + " ");
                }

                leafPrint(node.right);
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(10);
        bt.root.left = new Node(20);
        bt.root.left.right = new Node(25);
        bt.root.left.left = new Node(30);
        bt.root.left.left.left = new Node(40);

        bt.root.left.left.left.right = new Node(50);

        bt.root.left.left.left.right.right = new Node(60);

        bt.root.right = new Node(700);
        bt.root.right.left = new Node(765);
        bt.root.right.right = new Node(770);
        bt.root.right.right.left = new Node(775);
        bt.root.right.right.right = new Node(780);

        bt.root.right.right.right.right = new Node(790);

        bt.boundaryPrint(bt.root);
    }

}
