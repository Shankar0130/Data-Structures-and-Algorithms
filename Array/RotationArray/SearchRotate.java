// sorted:- [1,2,3,4,5,6,7,8,9,10]
// rotated:- [5,6,7,8,9,10,1,2,3,4]

package Array.RotationArray;

public class SearchRotate {

    static int rotated_search_helper(int[] arr, int low, int high, int key) {

        if (low > high) {
            return -1;
        }

        int mid = low + ((high - low) / 2);

        if (arr[mid] == key) {
            return mid;
        }

        if ((arr[low] <= arr[mid]) && (arr[mid] >= key) && (key >= arr[low])) {
            return rotated_search_helper(arr, low, mid - 1, key);
        }

        else if ((arr[high] >= arr[mid]) && (arr[mid] <= key) && (key <= arr[high])) {
            return rotated_search_helper(arr, mid + 1, high, key);
        }

        else if (arr[mid] <= arr[low]) {
            return rotated_search_helper(arr, low, mid - 1, key);
        }

        else if (arr[mid] >= arr[high]) {
            return rotated_search_helper(arr, mid + 1, high, key);
        }

        return -1;
    }

    static int rotated_search(int[] arr, int key) {
        return rotated_search_helper(arr, 0, arr.length - 1, key);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 9, 10, -1, 2, 3 };

        int result = rotated_search(arr, -1);

        if (result == -1) {
            System.out.println("No match");
        } else {
            System.out.println("Element " + arr[result] + " Found at index: " + result);
        }
    }
}
