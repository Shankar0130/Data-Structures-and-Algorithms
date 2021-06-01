package Strings;

class ValidateIp {

    static int validate_ip(String ipAddress) {
        String[] strings = ipAddress.split("\\.");
        int val = 0;

        for (int i = 0; i < strings.length; i++) {
            if (Integer.parseInt(strings[i]) <= 255 && Integer.parseInt(strings[i]) > 0) {
                val += 1;
            }
        }

        if (val == 4) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        String string = "254.111.111.111";

        System.out.println(validate_ip(string));
    }
}
