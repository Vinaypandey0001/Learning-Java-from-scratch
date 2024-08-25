public class RemoveBrackets {
    public static String removeBrackets(String str) {
        return str.replaceAll("[(){}\\[\\]]", "");
    }

    public static void main(String[] args) {
        String input = "a + b - (c * d) / {e + f} * [g - h]";
        String result = removeBrackets(input);
        System.out.println(result); // Output: "a + b - c * d / e + f * g - h"
    }
}
