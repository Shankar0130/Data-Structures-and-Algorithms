
package Array.RotationArray;

class ArrayRotate {

    // Brute-Force
    static void rotateArray(int[] arr) {
        int n1 = arr[0];
        int n2 = arr[1];
        int n3 = arr[2];

        for (int i = 3; i < arr.length; i++) {
            arr[i - 3] = arr[i];
        }

        arr[arr.length - 1] = n3;
        arr[arr.length - 2] = n2;
        arr[arr.length - 3] = n1;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {

        int[] arr = { 3, 5, 8, 10, 12, 16, 18, 24 };

        rotateArray(arr);

    }

}
