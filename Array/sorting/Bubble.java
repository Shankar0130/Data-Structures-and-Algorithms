package Array.sorting;

public class Bubble {
    public static void main(String[] args) {

        int[] arr = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
        int mlen = arr.length - 1;

        for (int i = 0; i < mlen; i++) {
            for (int j = 0; j < mlen - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];

                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
