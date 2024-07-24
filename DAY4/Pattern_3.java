/* Program to print Half Pyramid pattern


*
**
***
****

 */
public class Pattern_3 {
    public static void main(String[] args) {
        int i , j ;
        //outer loop
        for(i=1;i<=4;i++){
            // inner loop
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
