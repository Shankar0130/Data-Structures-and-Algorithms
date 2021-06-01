package Strings;

class Pallindrome {

    static void pallindrome(String s) {
        String rev = "";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            rev += chars[i];
        }

        if (rev.equals(s)) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not Pallindrome");
        }
    }

    public static void main(String[] args) {
        String word = "wow";
        pallindrome(word);
    }
}
