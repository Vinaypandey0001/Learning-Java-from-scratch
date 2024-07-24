/* Program to Print inverted Half Pyramid pattern 

****
***
**
*

 */
public class Pattern_4 {
    public static void main(String[] args) {
        int i ,j ;
        //outer loop 
        for(i=4;i>=1;i--){
            //inner loop
            for(j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
