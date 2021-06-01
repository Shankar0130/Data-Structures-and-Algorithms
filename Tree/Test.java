package Tree;

import java.util.List;
import java.util.Stack;

public class Test {

    static boolean rectest(int num) {
        if (num > 0) {
            return true || rectest(num - 1);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
}
