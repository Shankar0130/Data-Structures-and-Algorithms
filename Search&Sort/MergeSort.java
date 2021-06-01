import java.util.ArrayList;

// class MergeSort {

//     static void mergeSort(int[] arr, int l, int r) {

//         if (l < r) {
//             int mid = l + (r - l) / 2;

//             mergeSort(arr, l, mid);
//             mergeSort(arr, mid + 1, r);

//             int n1 = mid - l + 1;
//             int n2 = r - mid;

//             int[] left = new int[n1];
//             int[] right = new int[n2];

//             for (int i = 0; i < n1; i++) {
//                 left[i] = arr[i];
//             }
//             for (int i = 0; i < n2; i++) {
//                 right[i] = arr[mid + i];
//             }

//             int i = 0, j = 0, k = l;

//             while (i < n1 && j < n2) {
//                 if (left[i] < right[j]) {
//                     arr[k] = left[i];
//                     i++;
//                 } else {
//                     arr[k] = right[j];
//                     j++;
//                 }

//                 k++;
//             }

//         }
//     }

//     public static void main(String[] args) {
//         int[] arr = { 6, 5, 20, 10, 9, 2 };

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }

//         mergeSort(arr, 0, arr.length - 1);

//         System.out.println();

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }

// }

class MergeSort {

    void sort(int arr[], int l, int r) {
        if (l < r) {

            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves

            int n1 = m - l + 1;
            int n2 = r - m;

            int L[] = new int[n1];
            int R[] = new int[n2];

            for (int i = 0; i < n1; ++i)
                L[i] = arr[l + i];
            for (int j = 0; j < n2; ++j)
                R[j] = arr[m + 1 + j];

            int k = l;
            int i = 0, j = 0;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                } else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }
    }

    // /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // // // Driver code
    public static void main(String args[]) {
        int arr[] = { 6, 5, 20, 10, 9, 2 };

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
/* This code is contributed by Rajat Mishra */
