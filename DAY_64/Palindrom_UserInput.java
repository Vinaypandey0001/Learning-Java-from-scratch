import java.util.*;
public class Palindrom_UserInput{
    public static boolean palindrom(int n){
        int org=n;
        int rev =0;
        while(n!=0){
            int rem = n%10;
            rev = rev *10+ rem;
            n=n/10;
        }
        return (org==rev);
        
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number= sc.nextInt();
        if(palindrom(number)){
            System.out.println("The number is palindrom");
        }
        else 
        System.out.println("Number is not a palindrom");
    }
}
