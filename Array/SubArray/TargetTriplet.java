package Array.SubArray;

class TargetTriplet {

    static void tripletFinder_helper(int[] arr, int key) {
        int left = 0, right = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            left = i + 1;
            right = arr.length - 1;

            while (left < right) {
                if (arr[i] + arr[left] + arr[right] == key) {
                    System.out.println(arr[i] + ", " + arr[left] + ", " + arr[right]);
                    break;
                } else if (arr[i] + arr[left] + arr[right] > key) {
                    right -= 1;
                } else if (arr[i] + arr[left] + arr[right] < key) {
                    left += 1;
                } else {
                    System.out.println("no Target Triplet found");
                }
            }

        }

    }

    static void tripletFinder_helper_two(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == key) {
                        System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int a[] = { 1, 2, 4, 6, 8, 10, 45 };
        int sum = 18;

        tripletFinder_helper_two(a, sum);

    }
}
