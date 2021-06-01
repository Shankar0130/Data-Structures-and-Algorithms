import java.util.Stack;

class SortStackRec {

    static void sortStack(Stack<Integer> s) {
        if (!s.isEmpty()) {
            Integer temp = s.pop();
            sortStack(s);
            sortedInsert(s, temp);
        }
    }

    static void sortedInsert(Stack<Integer> s, Integer element) {
        if (s.isEmpty() || element > s.elementAt(s.size() - 1)) {
            s.push(element);
        } else {
            Integer temp = s.pop();
            sortedInsert(s, element);
            s.push(temp);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(-5);
        stack.push(18);
        stack.push(14);
        stack.push(-3);

        System.out.println(stack);

        sortStack(stack);

        System.out.println(stack);
    }
}
