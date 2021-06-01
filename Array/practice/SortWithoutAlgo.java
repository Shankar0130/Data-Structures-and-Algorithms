
package Array.practice;

import java.util.Arrays;
import java.util.Scanner;

class SortWithoutAlgo {

    public static void main(String[] args) {

        {
            Scanner sc = new Scanner(System.in);
            int testcase = sc.nextInt();
            int i = 0;
            while (i < testcase) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                int j = 0;
                while (j < n) {
                    arr[j] = sc.nextInt();
                    j = j + 1;
                }
                // Arrays.sort(arr);

                for (int a = 0; a < arr.length; a++) {
                    for (int b = a + 1; b < arr.length; b++) {
                        if (arr[a] > arr[b]) {
                            int temp = arr[a];
                            arr[a] = arr[b];
                            arr[b] = temp;

                        }
                    }
                }

                int k = 0;
                while (k < arr.length) {
                    System.out.print(arr[k] + " ");
                    k = k + 1;
                }
                System.out.println();
                i = i + 1;
            }
        }

    }
}
