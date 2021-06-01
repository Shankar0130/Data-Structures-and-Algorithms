
class NearByDuplicate {
    static String nearByDuplicate(String string) {
        if (string.length() == 1) {
            return string;
        } else if (string.charAt(0) == string.charAt(1)) {
            return nearByDuplicate(string.substring(1));
        }

        return nearByDuplicate(string.substring(0, 1)) + nearByDuplicate(string.substring(1));

    }

    public static void main(String[] args) {

        System.out.println(nearByDuplicate("myllccoo"));
    }
}
