import java.util.HashSet;

public class RemoveDuplicatesUnsortedArray {
    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int[] temp = new int[arr.length];
        int index = 0;

        for (int num : arr) {
            if (set.add(num)) {
                temp[index++] = num;
            }
        }

        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 4, 9, 6, 7, 5};
        int[] result = removeDuplicates(arr);

        System.out.println("Array after removing duplicates:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
