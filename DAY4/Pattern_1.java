/*Program to print pattern 
 
*****
*****
*****
*****

 */

public class Pattern_1{
    public static void main(String[] args) {
        int i,j ;
        //outer loop
        for(i=1;i<=4;i++){
            //Inner loop
            for(j=1;j<=5;j++){
                System.out.print("*"); // not using println cause we have to print * in same line
            }
            System.out.println();
        }
    }
}
