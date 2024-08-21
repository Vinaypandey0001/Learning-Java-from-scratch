public class AutomorphicNumber {
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = Integer.toString(num);
        String squareStr = Integer.toString(square);
        return squareStr.endsWith(numStr);
    }

    public static void main(String[] args) {
        int num = 25; // Example number
        if (isAutomorphic(num)) {
            System.out.println(num + " is an Automorphic number.");
        } else {
            System.out.println(num + " is not an Automorphic number.");
        }
    }
}
