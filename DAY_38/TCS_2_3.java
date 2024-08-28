/* To check whether a year is leap or not
Step 1:

We first divide the year by 4.
If it is not divisible by 4 then it is not a leap year.
If it is divisible by 4 leaving remainder 0 
Step 2:

We divide the year by 100
If it is not divisible by 100 then it is a leap year.
If it is divisible by 100 leaving remainder 0
Step 3:

We divide the year by 400
If it is not divisible by 400 then it is a leap year.
If it is divisible by 400 leaving remainder 0 
Then it is a leap year 
*/
import java.util.Scanner;
public class TCS_2_3
{
    public static void main(String[] args)
    {
        //scanner class declaration
        Scanner sc=new Scanner(System.in);
        //input year from user
        System.out.println("Enter a Year");
        int year = sc.nextInt();
        //condition for checking year entered by user is a leap year or not
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        System.out.println(year + " is a leap year.");
        else
        System.out.println(year + " is not a leap year.");
    }
}
