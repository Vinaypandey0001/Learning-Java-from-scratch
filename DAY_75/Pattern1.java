import java.util.Scanner;
public class Pattern1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);


        System.out.println("How many rows you want in this pattern?");

        int rows = sc.nextInt();

        System.out.println("Here is your pattern....!!!");
        
        for (int i=0; i< rows;i++ )
        {
            for (int j=0; j<=i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        } 

        sc.close();
    }
}
