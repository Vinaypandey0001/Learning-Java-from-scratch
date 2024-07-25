// Check the number is Palindrom or not

import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        int n ,r,c,s=0;
        System.out.println("Enter any number to check the number is palindrome or not");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c=n;
        while(n>0){
            r=n%10;
           s= (s*10)+r;
           n=n/10;
        }
        if(c==s){
            System.out.println("The number is palindrome");
        }
        else
        System.out.println("The number is not a palindrome");
    }
}
