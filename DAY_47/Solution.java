import java.util.Scanner;

public class Solution {
    // Declare static variables for breadth and height
    static int B;
    static int H;
    static boolean flag = true;

    // Static block for initialization and validation
    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        try {
            // Check if B and H are positive
            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}
