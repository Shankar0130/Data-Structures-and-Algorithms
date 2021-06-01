import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

class QueueStack {
    public static void main(String[] args) {
        // Deque<Integer> stack = new ArrayDeque<>();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // stack.push(40);

        // System.out.println(stack);

        // stack.pop();
        // System.out.println(stack);

        // Stack<Integer> stack = new Stack<>();

        // stack.push(10);
        // stack.push(20);
        // stack.push(30);

        // System.out.println(stack);

        // QueueUsingStack queue = new QueueUsingStack();

        // queue.add(10);
        // queue.add(20);
        // queue.add(30);
        // queue.add(40);
        // queue.print();
        // queue.remove();
        // queue.print();

        QueueUsingStack_Two stack = new QueueUsingStack_Two();

        stack.enQueue(10);
        stack.enQueue(20);
        stack.enQueue(30);
        stack.enQueue(40);

        stack.print();

        stack.deQueue();
        stack.print();

    }
}

// Favouring Enqueue

class QueueUsingStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void add(int val) {

        s1.push(val);
    }

    void remove() {

        if (s2.isEmpty()) {
            int size = s1.size();
            for (int i = 1; i <= size; i++) {
                s2.push(s1.pop());
            }
        }

        System.out.println("Item removed:  " + s2.pop());

    }

    void print() {

        if (!s2.isEmpty()) {
            Stack<Integer> newstack = new Stack<>();

            for (int i = 0; i < (s2.size() + s1.size()); i++) {
                newstack.push(s2.pop());
                if (s2.isEmpty()) {
                    s2.push(s1.pop());
                }
            }

            for (int i = 0; i < s2.size(); i++) {
                newstack.push(s2.pop());
            }

            System.out.println(newstack);
            return;
        }

        System.out.println(s1);
    }
}

// Favouring Dequeue

class QueueUsingStack_Two {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enQueue(int val) {
        if (s1.isEmpty()) {
            s1.push(val);
            return;
        }

        int sz1 = s1.size();
        for (int i = 1; i <= sz1; i++) {
            s2.push(s1.pop());
        }

        s1.push(val);

        int sz2 = s2.size();
        for (int i = 1; i <= sz2; i++) {
            s1.push(s2.pop());
        }
    }

    void deQueue() {
        if (!s1.isEmpty()) {
            s1.pop();
        }
    }

    void print() {
        System.out.println(s1);
    }
}
