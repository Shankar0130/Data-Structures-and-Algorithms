package recursion;

class Subset {

    static void subset(String s, int index, String holder) {
        if (index == s.length()) {
            System.out.println(holder);
            return;
        }

        subset(s, index + 1, holder + s.toCharArray()[index]);
        subset(s, index + 1, holder);
    }

    public static void main(String[] args) {
        subset("abc", 0, "");
    }
}
