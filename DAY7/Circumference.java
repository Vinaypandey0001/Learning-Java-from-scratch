// Program to calculate the circumference of circle using function @vinaypandey0001

import java.util.Scanner;

public class Circumference {
    public static double circumference(double radius) {
        return 2 * 3.14 * radius;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        
        System.out.println("The circumference of the circle is: " + circumference(radius));
        
        sc.close();
    }
} 
