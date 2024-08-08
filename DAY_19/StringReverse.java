public class StringReverse {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String original = "Recursion";
        System.out.println("Reversed string: " + reverse(original));
    }
}
