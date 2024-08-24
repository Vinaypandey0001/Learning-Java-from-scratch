import java.util.HashMap;
import java.util.Map;

public class FindRepeatingElements {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 4, 5, 8, 9, 7};

        HashMap<Integer, Integer> elementCount = new HashMap<>();

        for (int num : arr) {
            elementCount.put(num, elementCount.getOrDefault(num, 0) + 1);
        }

        System.out.println("Repeating elements in the array:");
        for (Map.Entry<Integer, Integer> entry : elementCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
