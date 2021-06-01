package MathQ;

import java.util.ArrayList;
import java.util.Arrays;

class KthPermutation {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    static int[] kthPermute(int v, int k) {
        ArrayList<Integer> mainArray = new ArrayList<>();
        for (int i = 1; i <= v; i++) {
            mainArray.add(i);
        }

        int[] res = new int[v];

        permuteHelper(mainArray, k, res, 0);

        return res;

    }

    static void permuteHelper(ArrayList<Integer> newArr, int k, int[] res, int index) {

        if (newArr.size() == 0) {
            return;
        }

        int bc = factorial(newArr.size() - 1);

        int select = (k - 1) / bc;

        res[index] = newArr.get(select);

        newArr.remove(select);

        k = k - (bc * select);

        index = index + 1;

        permuteHelper(newArr, k, res, index);

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(kthPermute(5, 120)));
    }

}