import java.util.Stack;

class GetMin {

    Stack<Integer> s = new Stack<>();
    Stack<Integer> ns = new Stack<>();

    /* returns min element from stack */
    int getMin() {
        // Your code here
        if (s.isEmpty()) {
            return -1;
        }

        return ns.pop();

    }

    /* returns poped element from stack */
    int pop() {
        // Your code here

        if (s.isEmpty()) {
            return -1;
        }

        ns.pop();
        return s.pop();

    }

    /* push element x into the stack */
    void push(int x) {
        // Your code here

        int min = x;

        if (!ns.isEmpty()) {
            if (min > ns.peek())
                min = ns.peek();
        }

        s.push(x);
        ns.push(min);

    }

    public static void main(String[] args) {
        GetMin s = new GetMin();

        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.getMin());
        s.push(1);
        System.out.println(s.getMin());

    }
}