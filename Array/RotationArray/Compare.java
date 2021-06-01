
// Find the maximum and minimum value common in any number arrays given :-

package Array.RotationArray;

class Compare {

    static int findMinInArray(int[] a1, int[] a2, int[] a3) {
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while (p1 < a1.length || p2 < a2.length || p3 < a3.length) {

            if ((a1[p1] == a2[p2]) && (a2[p2] == a3[p3])) {
                return a1[p1];
            }

            if ((a1[p1] <= a2[p2]) && (a2[p2] <= a3[p3])) {
                p1++;
            } else if ((a2[p2] <= a1[p1]) && (a2[p2] <= a3[p3])) {
                p2++;
            } else {
                p3++;
            }

        }

        return -1;
    }

    static int findMaxInArray(int[] a1, int[] a2, int[] a3) {

        if (a1.length == 0 && a2.length == 0 && a3.length == 0) {
            return -1;
        }

        int max1 = a1.length - 1;
        int max2 = a2.length - 1;
        int max3 = a3.length - 1;

        while (max1 >= 0 && max2 >= 0 && max3 >= 0) {

            if ((a1[max1] == a2[max2]) && (a2[max2] == a3[max3])) {
                return a1[max1];
            }

            if ((a1[max1] >= a2[max2]) && (a1[max1] >= a3[max3])) {
                max1--;
            } else if ((a2[max2] >= a1[max1]) && (a2[max2] >= a3[max3])) {
                max2--;
            } else {
                max3--;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] a1 = { 5, 6, 7, 20, 30, 54 };
        int[] a2 = { 0, 1, 2, 6, 7, 20, 23, 60, 104 };
        int[] a3 = { 3, 4, 6, 20, 25 };

        int maxRes = findMaxInArray(a1, a2, a3);

        int minRes = findMinInArray(a1, a2, a3);

        if (maxRes == -1 && minRes == -1) {
            System.out.println("No Common Maximum/Minimum found");
        } else {
            System.out.println("Maximum is:- " + maxRes + "\n" + "Minimum is:- " + minRes);
        }
    }
}