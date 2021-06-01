public class MTC {

    static void order(int[] arr) {
        int z = 0, o = 0, t = 0, index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                z += 1;
            }

            if (arr[i] == 1) {
                o += 1;
            }

            if (arr[i] == 2) {
                t += 1;
            }
        }

        while (z != 0) {
            arr[index] = 0;
            index = index + 1;
            z = z - 1;
        }

        while (o != 0) {
            arr[index] = 1;
            index = index + 1;
            o = o - 1;
        }

        while (t != 0) {
            arr[index] = 2;
            index = index + 1;
            t = t - 1;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 1, 0, 2, 1, 2, 0, 0, 1, 2 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        order(arr);

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
