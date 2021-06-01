package MathQ;

import java.util.ArrayList;
import java.util.Arrays;

class Permutation {

    static ArrayList<String> stringPermutation(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        permu_helper(str, "", arrayList);
        return arrayList;

    }

    static void permu_helper(String newString, String temp, ArrayList<String> result) {

        if (newString.length() == 0) {
            result.add(temp);
        }

        for (int i = 0; i < newString.length(); i++) {
            permu_helper(newString.substring(0, i) + newString.substring(i + 1, newString.length()),
                    temp + newString.charAt(i), result);
        }

    }

    public static void main(String[] args) {

        Integer num = 123;
        System.out.println(stringPermutation(Integer.toString(num)));
        // System.out.println(stringPermutation(num));

    }
}
