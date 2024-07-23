// Easy program to print counting using for loop @vinaypandey0001
import java.util.Scanner;

public class For_Loop_ex2{
    public static void main(String[] args) {
        int i, num;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number till you want to print counting");
        num = sc.nextInt();
        for ( i =1; i < num+1; i++) {
            System.out.println(i);
            
        }
    }
    
}
