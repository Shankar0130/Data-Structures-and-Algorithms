package Array;

import java.util.Scanner;

class TwoTest {

    public static void main(String[] args) {
        int val1 = 10;
        int val2 = 20;

        System.out.println("Before Swapping:- " + val1 + " " + val2);

        val1 = val1 ^ val2;
        val2 = val1 ^ val2;
        val1 = val1 ^ val2;

        System.out.println("After Swapping:- " + val1 + " " + val2);
    }
}
