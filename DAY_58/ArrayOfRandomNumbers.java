import java.util.Random;

public class ArrayOfRandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int size = 10; // Adjust the size as needed
        int min = 1;
        int max = 100;

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(max - min + 1) + min;
        }

        System.out.println("Array of random numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
