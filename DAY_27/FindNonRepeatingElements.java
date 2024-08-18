import java.util.HashMap;

public class FindNonRepeatingElements {
    public static void findNonRepeating(int[] arr) {
        HashMap<Integer, Integer> elementCount = new HashMap<>();

        for (int num : arr) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }

        System.out.println("Non-repeating elements:");
        for (int num : arr) {
            if (elementCount.get(num) == 1) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 4, 9, 6, 7, 5};
        findNonRepeating(arr);
    }
}
