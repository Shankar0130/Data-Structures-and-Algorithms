package paypal;

public class Keypad {
    public static int possibleStringCount(String s) {
        int len = s.length();
        int[] dp = new int[len];
        dp[0] = 1;// possibility is 1 for a single character
        for (int i = 1; i < len; ++i) {
            int possible_chars_length = numberOfRepresentedCharacters(s.charAt(i) - '0') - 1;// because current
                                                                                             // character itself counts
                                                                                             // as 1.
            dp[i] = 0;
            for (int j = i; j >= 0; j--) {
                if (i - possible_chars_length > j)
                    break;
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - 1 > -1) {
                        dp[i] += dp[j - 1];
                    } else {
                        dp[i] += 1;// if there are no combinations before it, then it represents a single character
                    }
                }
            }
        }

        return dp[len - 1];
    }

    private static int numberOfRepresentedCharacters(int digit) {
        if (digit == 7 || digit == 9)
            return 4;
        return 3;// it is assumed that digits are between 2-9 always
    }

    public static void main(String[] args) {
        String[] tests = { "222", "2233", "23456789", "54667877", "5466", "7777", "22", "7898989899", "77779999" };

        for (String testcase : tests) {
            System.out.println(testcase + " : " + possibleStringCount(testcase));
        }
    }
}
