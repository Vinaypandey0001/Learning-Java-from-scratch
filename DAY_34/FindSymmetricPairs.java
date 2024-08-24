import java.util.HashMap;

public class FindSymmetricPairs {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {2, 1}, {4, 5}, {5, 4}};

        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("Symmetric pairs are:");
        for (int[] pair : arr) {
            int first = pair[0];
            int second = pair[1];

            if (map.containsKey(second) && map.get(second) == first) {
                System.out.println("(" + second + ", " + first + ")");
            } else {
                map.put(first, second);
            }
        }
    }
}
