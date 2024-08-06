import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        // Adding elements
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);

        // Accessing elements
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println("Element at index " + i + ": " + dynamicArray.get(i));
        }
    }
}
