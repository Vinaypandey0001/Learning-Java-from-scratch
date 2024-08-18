import java.util.Arrays;

public class AddElementToArray {
    public static int[] addElement(int[] arr, int element) {
        int[] newArray = Arrays.copyOf(arr, arr.length + 1);
        newArray[arr.length] = element;
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int elementToAdd = 6;

        int[] newArray = addElement(arr, elementToAdd);

        System.out.println("Array after adding element:");
        System.out.println(Arrays.toString(newArray));
    }
}
