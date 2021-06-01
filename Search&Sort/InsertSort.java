public class InsertSort {

    static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            int j = i - 1;

            while (j > 0 && arr[j] > arr[j - 1]) {

                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

                j = j - 1;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 1, 4, 3 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        insertSort(arr);
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
