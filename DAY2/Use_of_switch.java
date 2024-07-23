// code to implement switch case in your program @vinaypandey0001

import java.util.Scanner;

public class Use_of_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number (1-7) to get the corresponding day of the week:");
        int dayNumber = sc.nextInt();
        
        switch (dayNumber) {
            
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid number. Please enter a number between 1 and 7.");
                break;
        }
        
        sc.close();
    }
}
