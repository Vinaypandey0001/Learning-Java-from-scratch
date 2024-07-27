// program to check voting eligiblity using FUnction @vinaypandey0001
import java.util.Scanner;

public class Voting_eligiblity{
    public static boolean isEligibleToVote(int age) {
        return age > 18;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        
        if (isEligibleToVote(age)) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        
        scanner.close();
    }
}
