package Tree;

class PathSum {

    static boolean pathSum(NodeB node, int sum) {
        if (node == null) {
            return sum == 0;
        }

        sum = sum - node.data;

        return pathSum(node.left, sum) || pathSum(node.right, sum);

    }

    public static void main(String[] args) {
        NodeB node = new NodeB(5);

        node.left = new NodeB(4);
        node.right = new NodeB(8);
        node.left.left = new NodeB(11);

        node.left.left.left = new NodeB(7);
        node.left.left.right = new NodeB(2);

        node.right.left = new NodeB(13);
        node.right.right = new NodeB(4);
        node.right.right.right = new NodeB(1);

        System.out.println(pathSum(node, 22));

    }
}

class NodeB {
    int data;
    NodeB left;
    NodeB right;

    NodeB(int val) {
        this.data = val;
        left = right = null;
    }
}