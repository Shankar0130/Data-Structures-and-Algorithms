package Graph;

import java.util.Stack;

class test {

    static int cur = 0;

    static void deleteMid(Stack<Integer> s, int size) {

        if (s.empty()) {
            return;
        }

        int x = s.pop();
        cur = cur + 1;
        if (cur == (size / 2)) {
            s.pop();
        }
        deleteMid(s, size);
        inser_bot(s, x);

    }

    static void inser_bot(Stack<Integer> s, int x) {
        if (s.empty()) {
            s.push(x);
        } else {
            int pop = s.pop();
            inser_bot(s, x);
            s.push(pop);
        }
    }

    // Driver Code
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // int mid = (stack.size() / 2) + 1;

        System.out.println(stack);
        deleteMid(stack, stack.size());
        System.out.println(stack);

        // Queue<Integer> q = new LinkedList<>();

    }
}