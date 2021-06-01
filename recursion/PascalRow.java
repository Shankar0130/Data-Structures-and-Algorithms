
class PascalRow {

    static int[] pascalNthRow(int row) {
        if (row == 0) {
            return new int[] { 1, 0 };
        } else {
            int[] prevarr = pascalNthRow(row - 1);
            int[] arr = new int[row + 1];

            arr[0] = 1;
            arr[row] = 1;
            for (int i = 0; i < prevarr.length - 1; i++) {

                arr[i + 1] = prevarr[i] + prevarr[i + 1];

            }

            return arr;

        }
    }

    public static void main(String[] args) {
        int[] arr = pascalNthRow(5);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
