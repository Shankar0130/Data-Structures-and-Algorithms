package Array.SubArray;

class OneSideMove {
    // move all 0s to left side
    static void moveToOneSide(int[] arr) {
        int read = arr.length - 1;
        int write = arr.length - 1;

        while (read != -1) {
            if (arr[read] == 0) {
                read -= 1;
            } else if (arr[read] != 0) {
                arr[write] = arr[read];
                write -= 1;
                read -= 1;
            }
        }

        while (write != -1) {
            arr[write] = 0;
            write -= 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 10, 0, 60, 61, 0, 90, 0 };
        moveToOneSide(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
