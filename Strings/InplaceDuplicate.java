package Strings;

class InplaceDuplicate {

    static String inplaceDuplicate(String string) {
        char[] chars = string.toCharArray();
        String newString = "";

        int read = 0;
        int write = 0;

        for (int i = 0; i < chars.length; i++) {
            if (newString.indexOf(chars[i]) == -1) {
                newString += chars[i];
                chars[write] = chars[read];
                read++;
                write++;
            } else {
                read++;
            }

        }

        return newString;
    }

    public static void main(String[] args) {
        String string = "abcadbcas";
        System.out.println(inplaceDuplicate(string));
    }
}
