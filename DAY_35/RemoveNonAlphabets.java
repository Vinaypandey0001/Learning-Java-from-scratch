public class RemoveNonAlphabets {
    public static String removeNonAlphabets(String str) {
        return str.replaceAll("[^a-zA-Z]", "");
    }

    public static void main(String[] args) {
        String input = "He110, W0rld! 123";
        String result = removeNonAlphabets(input);
        System.out.println(result); // Output: "HeWrld"
    }
}
