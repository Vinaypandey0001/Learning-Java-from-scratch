// Program to calculate simple interest @vinay 

import java.util.Scanner;

class SimpleInterest{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Si ,p ,r ,t;
        System.out.println("Enter the principle Amount");
        p = sc.nextInt();

        System.out.println("Enter the rate %");
        r = sc.nextInt();

        System.out.println("Enter the time in years");
        t = sc.nextInt();

        Si = p*r*t/100;

        System.out.println("Simple interest is =" +Si);





    }
}
