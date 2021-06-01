package Array.practice;

class ReverseArray {
    public static void main(String[] args) {

        String sentence = " mai bhagwan kyu hu";
        char[] arr = sentence.toCharArray();

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println();

        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Character.isWhitespace(arr[i])) {
                end = i - 1;
                int left = start;
                int right = end;
                while (left < right) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    left++;
                    right--;
                }
                start = i + 1;
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
