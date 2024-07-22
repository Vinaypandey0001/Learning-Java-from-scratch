// Finding student is pass or fail using if -else statements

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the marks of student ");
        marks = sc.nextInt();
        if(marks >= 40){
        System.err.println("Passed");
        System.err.println("Congratulation you are PROMOTED");
    }
        else{
        System.err.println("Failed");
        System.err.println("Good luck for next time");
    }
    sc.close();

}
}
