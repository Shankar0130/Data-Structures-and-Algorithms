package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        hm.put(1, 2);
        hm.put(2, 1);
        hm.put(3, 3);
        hm.put(10, 2);

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getValue());
        }

    }
}
