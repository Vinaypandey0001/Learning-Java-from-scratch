/* Program to print pattern 
 
   * * * * * 
   *       *
   *       *
   * * * * *
 */

 public class Pattern_2 {
    public static void main(String[] args) {
        int i, j;
        // outer loop 
        for (i = 1; i <= 4; i++) {
            // inner loop
            for (j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5) { //this is for border lines
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
