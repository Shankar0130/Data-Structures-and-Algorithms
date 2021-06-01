import java.util.ArrayList;
import java.util.List;

class DecimalToBinary {
    static String decimalToBinary(int num) {

        if (num <= 1) {
            return String.valueOf(num);
        } else {
            return decimalToBinary(num / 2) + decimalToBinary(num % 2);
        }

    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(11));

    }
}
