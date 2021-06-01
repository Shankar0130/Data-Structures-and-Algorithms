package Tree;

class IdenticalTree {

    static boolean isSameTree(MyTree p, MyTree q) {
        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null) {
            return (p.data == q.data) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }

        return false;
    }

    public static void main(String[] args) {
        MyTree p = new MyTree(1);

        p.left = new MyTree(2);
        p.right = new MyTree(3);

        p.left.left = new MyTree(4);
        p.left.right = new MyTree(5);

        MyTree q = new MyTree(1);

        q.left = new MyTree(2);
        q.right = new MyTree(3);

        q.left.left = new MyTree(4);
        q.left.right = new MyTree(5);

        if (isSameTree(p, q))
            System.out.println("Identical");
        else
            System.out.println("Not Identical");

    }
}

class MyTree {
    int data;
    MyTree left;
    MyTree right;

    MyTree(int val) {
        this.data = val;
        left = right = null;
    }
}