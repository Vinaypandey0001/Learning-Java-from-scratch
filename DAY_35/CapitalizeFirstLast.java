public class CapitalizeFirstLast {
    public static String capitalizeFirstAndLast(String str) {
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 1) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1, word.length() - 1))
                      .append(Character.toUpperCase(word.charAt(word.length() - 1)))
                      .append(" ");
            } else if (word.length() == 1) {
                result.append(Character.toUpperCase(word.charAt(0))).append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "hello world";
        String result = capitalizeFirstAndLast(input);
        System.out.println(result); // Output: "HellO WorlD"
    }
}
