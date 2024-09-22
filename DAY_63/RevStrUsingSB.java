public class RevStrUsingSB {
    public static void main(String[] args) {
        String s = "prepinsta";
        StringBuilder sb = new StringBuilder(s);
        System.out.println("Original string: " + sb);
        sb.reverse();
        System.out.println("Reversed string: " + sb);
    }
}
