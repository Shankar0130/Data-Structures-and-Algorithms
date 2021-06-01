package Array.SubArray;

class BuySell {

    static void buySell(int[] arr) {
        int global_profit = 0;
        int global_small = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (global_small > arr[i]) {
                global_small = arr[i];
            } else if (global_profit < arr[i] - global_small) {
                global_profit = arr[i] - global_small;
            }
        }
        System.out.println(global_profit);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 2, 4 };
        buySell(arr);
    }
}
