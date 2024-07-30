// Program to reverse a string @vinaypandey0001
public class ReverseString {
    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Reverse of " + str + " is " + reverse(str));
    }
}
