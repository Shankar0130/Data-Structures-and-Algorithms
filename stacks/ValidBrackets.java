import java.util.HashMap;
import java.util.Stack;

class ValidBrackets {

    HashMap<Character, Character> bracket = new HashMap<>();
    Stack<Character> stack = new Stack<>();

    boolean isValid(String s) {

        bracket.put('(', ')');
        bracket.put('{', '}');
        bracket.put('[', ']');

        char[] charArr = s.toCharArray();

        int index = 0;
        while (index <= charArr.length - 1) {
            if ((charArr[index] == '(') || (charArr[index] == '{') || (charArr[index] == '[')) {
                stack.push(charArr[index]);
                index++;
            } else if (!stack.isEmpty() && charArr[index] == bracket.get(stack.elementAt(stack.size() - 1))) {
                stack.pop();
                index++;
            } else {
                return false;
            }

        }

        if (stack.isEmpty())
            return true;
        return false;
    }

    public static void main(String[] args) {
        String s = "(]";

        ValidBrackets vb = new ValidBrackets();

        System.out.println(vb.isValid(s));

    }
}
