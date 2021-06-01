class NextPermutation {

    static void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {

            int j = nums.length - 1;

            while (j >= i && nums[j] <= nums[i]) {
                j--;
            }

            swap(nums, i, j);
            reverse(nums, i + 1);
        } else {

            reverse(nums, 0);
        }

    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;

        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 6, 5, 4 };

        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        nextPermutation(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
