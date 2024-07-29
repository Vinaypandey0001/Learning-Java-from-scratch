//Program to find the Maximum Element in an Array @vinaypandey0001

public class ArrayExample3 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 4};
        int max = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println("Max: " + max);
    }
}
