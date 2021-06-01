package Array.TCSExplore;

import java.util.Scanner;

class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int checkedVal = sc.nextInt();
        System.out.println(isPerfectSquare(checkedVal));

    }

    static boolean isPerfectSquare(int checkedValue) {
        int sqrt = (int) Math.sqrt(checkedValue);

        for (int i = 0; i <= sqrt; i++) {
            if ((i * i) == checkedValue) {
                return true;
            }
        }
        return false;
    }
}
