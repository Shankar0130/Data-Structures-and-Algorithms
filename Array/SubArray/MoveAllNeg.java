package Array.SubArray;

class MoveAllNeg {

    static void moveAllNeg(int[] arr) {
        int negp = 0;
        int negv = 0;
        int sortp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negp = i;
                negv = arr[i];

                while (negp > sortp) {
                    arr[negp] = arr[negp - 1];
                    negp--;
                }
                arr[sortp] = negv;
                sortp++;

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
        moveAllNeg(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}