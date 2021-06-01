package paypal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class IntersectArr {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("shankar");
        set.add("kanchan");
        set.add("saching");
        set.add("shankar");
        set.add("kanchan");

        System.out.println(set.contains("shankar"));

        int[] arr = new int[] { 1, 2, 12, 3, 20, 5 };
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}