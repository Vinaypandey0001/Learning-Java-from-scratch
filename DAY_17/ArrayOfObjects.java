public class ArrayOfObjects {
    public static void main(String[] args) {
        String[] names = new String[3]; // Array of Strings

        // Assigning values to the array
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";

        // Iterating over the array
        for (String name : names) {
            System.out.println(name);
        }
    }
}
