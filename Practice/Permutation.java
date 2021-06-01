package Practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Permutation {

    static ArrayList<String> stringPermuta(String str) {
        ArrayList<String> res = new ArrayList<String>();
        permu_helper(str, "", res);
        return res;
    }

    static void permu_helper(String str, String temp, ArrayList<String> res) {
        if (str.length() == 0) {
            res.add(temp);
        }

        for (int i = 0; i < str.length(); i++) {
            permu_helper(str.substring(0, i) + str.substring(i + 1, str.length()), temp + str.charAt(i), res);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(stringPermuta(str));

    }
}
