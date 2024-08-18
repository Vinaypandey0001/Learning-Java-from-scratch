import java.util.HashSet;

public class FindRepeatingElements {
    public static void findRepeating(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> repeated = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                repeated.add(num);
            }
        }

        System.out.println("Repeating elements:");
        for (int num : repeated) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 4, 9, 6, 7, 5};
        findRepeating(arr);
    }
}
