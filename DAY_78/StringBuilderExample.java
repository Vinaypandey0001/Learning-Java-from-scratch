public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world!");
        System.out.println(sb.toString()); // Output: "Hello world!"
        
        sb.insert(6, "beautiful ");
        System.out.println(sb.toString()); // Output: "Hello beautiful world!"
        
        sb.reverse();
        System.out.println(sb.toString()); // Output: "!dlrow lufituaeb olleH"
    }
}
