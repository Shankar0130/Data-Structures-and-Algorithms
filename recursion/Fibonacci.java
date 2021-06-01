
import java.util.HashMap;

class Fibonacci {

    static Integer fibonacci_number(int n, HashMap<Integer, Integer> h) {
        HashMap<Integer, Integer> hm = h;

        if (hm.get(n) != null) {
            return hm.get(n);
        } else {
            hm.put(n, fibonacci_number(n - 1, hm) + fibonacci_number(n - 2, hm));
            return hm.get(n);
        }

    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(fibonacci_number(n, new HashMap<>() {
            {
                put(1, 0);
                put(2, 1);
            }
        }));
    }
}