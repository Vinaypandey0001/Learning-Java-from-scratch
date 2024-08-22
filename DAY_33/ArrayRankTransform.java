import java.util.*;

public class ArrayRankTransform {
    public static int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }
        
        for (int i = 0; i < n; i++) {
            arr[i] = rankMap.get(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 30};
        int[] rankedArr = arrayRankTransform(arr);
        System.out.println(Arrays.toString(rankedArr)); // Output: [4, 1, 2, 3]
    }
}
