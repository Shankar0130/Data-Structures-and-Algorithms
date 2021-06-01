public class Practice {

    static void makeString(String s) {
        if (s.length() != 0) {
            char temp = s.charAt(s.length() - 1);
            s = s.substring(0, s.length() - 1);
            makeString(s);
            bindString(s, temp);
        }
    }

    static void bindString(String s, char c) {
        s = s + c;
    }

    public static void main(String[] args) {
        String s = "shankar";
        makeString(s);
        System.out.println(s);
    }
}
