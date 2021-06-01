class Bubble {

    static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("hello");
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // int temp = arr[j];
                    // arr[j] = arr[j + 1];
                    // arr[j + 1] = temp;

                    swap(arr[j], arr[j + 1]);

                }

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 5, 2, 4, 1, 7 };
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
