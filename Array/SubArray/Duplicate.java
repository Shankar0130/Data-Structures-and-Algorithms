package Array.SubArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Duplicate {

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                int val = hashMap.get(arr[i]) + 1;
                hashMap.put(arr[i], val);
                System.out.println(hashMap.get(arr[i]));
            } else {
                hashMap.put(arr[i], 1);
            }

            if (hashMap.get(arr[i]) == 2) {
                a.add(arr[i]);
            }

        }

        if (a.isEmpty()) {
            a.add(-1);
        }

        Collections.sort(a);
        return a;

    }

    public static void main(String[] args) {
        System.out.println(duplicates(new int[] { 13, 9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19,
                20, 2, 4, 25, 14, 23, 14 }, 26));

        // System.out.println(duplicates(new int[] { 2, 3, 1, 2, 3 }, 5));
    }
}
