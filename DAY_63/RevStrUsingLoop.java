public class RevStrUsingLoop{
    public static void main(String[] args) {
        String s = "prepinsta";
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        System.out.println("Reversed string: " + rev);
    }
}
