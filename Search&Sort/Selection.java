class Selection {

    // static void selectSort(int[] arr) {
    // for (int i = 0; i < arr.length; i++) {
    // int min_index = i;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[j] < arr[min_index]) {
    // min_index = j;
    // }
    // }

    // int temp = arr[min_index];
    // arr[min_index] = arr[i];
    // arr[i] = temp;
    // }
    // }

    static void selSortMax(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[index]) {
                    index = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 5, 2, 4, 1, 7 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selSortMax(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
