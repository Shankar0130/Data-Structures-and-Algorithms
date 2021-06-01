package paypal;

class VowelPermutation {

    // method to count the total number
    // of ways to sum up to 'N'
    static int countWays(int N, int k) {
        int[] arr = new int[k];
        for (int i = 1; i <= k; i++) {
            arr[i - 1] = i;
        }

        int count[] = new int[N + 1];

        // base case
        count[0] = 1;

        // count ways for all values up
        // to 'N' and store the result
        for (int i = 1; i <= N; i++)
            for (int j = 0; j < arr.length; j++)

                // if i >= arr[j] then
                // accumulate count for value 'i' as
                // ways to form value 'i-arr[j]'
                if (i >= arr[j])
                    count[i] += count[i - arr[j]];

        // required number of ways
        return count[N];

    }

    public static void main(String[] args) {

        System.out.println(countWays(8, 2));
        // System.out.println(Integer.MAX_VALUE);
    }
}