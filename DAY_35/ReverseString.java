public class ReverseString {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String input = "Hello";
        String result = reverseString(input);
        System.out.println(result); // Output: "olleH"
    }
}
