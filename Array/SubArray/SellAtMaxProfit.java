package Array.SubArray;

class SellAtMaxProfit {

    // Brute-Force Approach

    // static void sellMaxProfit_BF(int[] arr){

    // }

    static void sellMaxProfit(int[] arr) {
        int global_Small = arr[0];
        int global_profit = 0;
        int current_profit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (global_Small > arr[i]) {
                global_Small = arr[i];
            }

            current_profit = arr[i] - global_Small;
            if (global_profit < current_profit) {
                global_profit = current_profit;
            }
        }

        System.out.println("Global Profit is: " + global_profit + " Global small is: " + global_Small);

    }

    public static void main(String[] args) {
        int[] arr = { 8, 9, 5, 6, 12, 10, 11 };
        sellMaxProfit(arr);
    }
}
