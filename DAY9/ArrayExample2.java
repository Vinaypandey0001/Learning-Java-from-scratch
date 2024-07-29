// program to print the sum of element in array

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        System.out.println("Sum: " + sum);
    }
}
