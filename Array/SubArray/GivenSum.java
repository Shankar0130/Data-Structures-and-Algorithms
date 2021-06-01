package Array.SubArray;

import java.util.ArrayList;

class GivenSum {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        int l = 0;
        int sum = 0;
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            while (sum > s && l < i) {
                sum = sum - arr[l];
                l++;
            }
            if (sum == s) {
                a.add(l + 1);
                a.add(i + 1);
                return a;
            }

        }

        a.add(-1);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[] { 1, 2, 3, 7, 5 }, 5, 5));
    }
}