import java.util.Scanner;
public class Pattern2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Taking rows value from the user

        System.out.println("How many rows you want in this pattern?");

        int rows = sc.nextInt();

        System.out.println("Here is your pattern....!!!");
        
        for (int i= rows-1; i>=0 ; i--)
        {
            for (int j=0; j<=i; j++)
            {
                 System.out.print("*" + " ");
            }
            System.out.println();
        }

        //Close the resources
        sc.close();

    }
}
