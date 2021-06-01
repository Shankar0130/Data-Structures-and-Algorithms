package Array.practice;

class SquareRoot {

    double squareRoot_helper(double num) {
        double l = 0;
        double h = num;
        double mid;

        if (l > h)
            return 0.1;

        while (l <= h) {
            mid = (l + h) / 2;

            if (mid * mid == num)
                return mid;

            if (mid * mid <= num)
                l = mid + 1;
            else
                h = mid - 1;
        }

        return 0.1;
    }

    public static void main(String[] args) {
        SquareRoot squareRoot = new SquareRoot();

        double num = 50;
        double res = squareRoot.squareRoot_helper(num);
        if (res == 0.1) {
            System.out.println(0.1);
        } else {
            System.out.println(res);
        }

    }
}
