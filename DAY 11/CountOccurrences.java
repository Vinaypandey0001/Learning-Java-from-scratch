import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        for (int num : array) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Occurrences of each element:");
        for (Map.Entry<Integer, Integer> entry : occurrenceMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
