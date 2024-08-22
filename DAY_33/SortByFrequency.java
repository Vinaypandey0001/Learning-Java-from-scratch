import java.util.*;

public class SortByFrequency {
    public static int[] sortByFrequency(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> resultList = new ArrayList<>();
        freqMap.entrySet().stream()
                .sorted((a, b) -> {
                    int freqCompare = b.getValue().compareTo(a.getValue());
                    int valueCompare = a.getKey().compareTo(b.getKey());
                    return freqCompare == 0 ? valueCompare : freqCompare;
                })
                .forEach(e -> {
                    for (int i = 0; i < e.getValue(); i++) {
                        resultList.add(e.getKey());
                    }
                });
        
        return resultList.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 5, 4, 3};
        int[] sortedArr = sortByFrequency(arr);
        System.out.println(Arrays.toString(sortedArr)); // Output: [4, 4, 5, 5, 3, 6]
    }
}
