// program to reverse a array @vinaypandey0001

public class ArrayExample4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
