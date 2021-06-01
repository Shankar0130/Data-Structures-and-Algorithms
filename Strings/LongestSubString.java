package Strings;

import java.util.HashMap;

class LongestSubString {

    static int longest_substring(String s) {

        char[] charstring = s.toCharArray();

        HashMap<Character, Integer> hm = new HashMap<>();

        int global_max = 0;
        int start = 0;

        for (int i = 0; i < charstring.length; i++) {
            if (hm.get(charstring[i]) != null) {
                if ((hm.get(charstring[i]) + 1) > start) {
                    start = hm.get(charstring[i]);
                }
            }
            hm.put(charstring[i], i);
            if ((i - start + 1) > global_max) {
                global_max = (i - start + 1);
            }
        }

        return global_max;

    }

    public static void main(String[] args) {
        String string = "ABCDABCEF";

        System.out.println(longest_substring(string));

    }
}
