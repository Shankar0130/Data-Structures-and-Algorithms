
class Quicksort {

    static void quicksort(int[] arr, int l, int r) {

        if (l < r) {

            int pos = l;

            for (int i = l; i <= r; i++) {
                if (arr[i] < arr[l]) {
                    pos = pos + 1;
                    int temp = arr[pos];
                    arr[pos] = arr[i];
                    arr[i] = temp;
                }
            }

            int temp = arr[pos];
            arr[pos] = arr[l];
            arr[l] = temp;

            quicksort(arr, l, pos - 1);
            quicksort(arr, pos + 1, r);

            int n1 = pos - l;
            int n2 = r - pos;

            int[] left = new int[n1];
            int[] right = new int[n2];

            for (int i = 0; i < n1; i++) {
                left[i] = arr[l + i];
            }

            for (int i = 0; i < n2; i++) {
                right[i] = arr[pos + 1 + i];
            }

            int k = l, i = 0, j = 0;

            while (i < n1) {
                arr[k] = left[i];
                i++;
                k++;
            }

            arr[k] = arr[pos];
            k++;

            while (j < n2) {
                arr[k] = right[j];
                j++;
                k++;
            }

        }

    }

    public static void main(String[] args) {
        System.out.println("Hello world");

        int[] arr = { 4, 3, 7, 2, 9, 1, 8 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        quicksort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}