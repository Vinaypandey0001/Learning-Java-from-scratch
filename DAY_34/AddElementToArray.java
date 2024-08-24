import java.util.Arrays;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // original array
        int elementToAdd = 6; // element to be added

        // Create a new array with size greater by 1
        int[] newArr = new int[arr.length + 1];

        // Copy elements from old array to new array
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        // Add the new element to the end of the array
        newArr[arr.length] = elementToAdd;

        System.out.println("Array after adding element: " + Arrays.toString(newArr));
    }
}
