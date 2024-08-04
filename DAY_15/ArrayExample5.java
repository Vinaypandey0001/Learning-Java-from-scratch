// program to find the specific element in the array  @vinaypandey0001

import java.util.Scanner;
public class ArrayExample5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1, 2, 2, 3, 4, 2, 5};
        int target = 0;
        target =sc.nextInt();
        int i  = 0;
        
        for (int number : numbers) {
            if (number == target) {
                i++;
            }
        }
        
        System.out.println("Number " + target + " occurs " + i + " times.");
    }
}
