import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class StackQueue {

    public static void main(String[] args) {

        // StackusingQueue stack = new StackusingQueue();

        // // stack.push(10);
        // // stack.push(20);
        // // stack.push(30);
        // // stack.push(40);
        // // stack.print();

        // stack.pop();
        // // // stack.print();
        // // stack.pop();
        // // stack.pop();
        // // stack.push(50);
        // // stack.print();

        StackusingQueue_two stack = new StackusingQueue_two();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.print();
        stack.pop();
        stack.print();
    }
}

// Favouring push

class StackusingQueue {
    Queue<Integer> q1 = new PriorityQueue<>();
    Queue<Integer> q2 = new PriorityQueue<>();

    void push(int val) {
        q1.add(val);

    }

    void print() {
        System.out.println(q1);
    }

    void pop() {

        if (q1.size() + q2.size() == 0) {
            System.out.println("-1");
            return;
        }

        int size = q1.size() - 1;
        for (int i = 1; i <= size; i++) {
            q2.add(q1.remove());
        }

        q1.remove();
        // System.out.println(q1.remove());
        // System.out.println(q1 + "\n" + q2);

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

    }
}

// Favouring pop

class StackusingQueue_two {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    int pop() {
        if (q1.size() + q2.size() == 0)
            return -1;
        return q1.remove();
    }

    void push(int val) {
        if (q1.size() == 0) {
            q1.add(val);
            return;
        }

        q2.add(val);

        int size = q1.size();

        for (int i = 0; i < size; i++) {
            q2.add(q1.remove());
        }

        Queue<Integer> tempqueue = q1;
        q1 = q2;
        q2 = tempqueue;

    }

    void print() {

        System.out.println(q1);
    }

}