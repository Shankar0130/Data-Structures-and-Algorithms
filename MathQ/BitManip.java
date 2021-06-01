package MathQ;

class BitManip {

    static int divideBit(int dividend, int divisor) {

        if (divisor == 0)
            return -1;
        if (divisor < 0)
            return 0;
        if (divisor == dividend)
            return 1;
        if (divisor == 1)
            return dividend;

        int qu = 1;
        int temp = divisor;

        while (temp < dividend) {
            temp <<= 1;
            qu <<= 1;
        }

        if (temp == dividend) {
            return qu;

        }
        qu >>= 1;
        temp >>= 1;
        return qu + divideBit(dividend - temp, divisor);

    }

    static int xorofNum(int n) {
        if (n % 4 == 0) {
            return n;
        }

        if (n % 4 == 1) {
            return 1;
        }

        if (n % 4 == 2) {
            return n + 1;
        }

        else {
            return 0;
        }
    }

    public static void main(String[] args) {

        int n = 5 & 6;
        System.out.println(n);
    }

}
