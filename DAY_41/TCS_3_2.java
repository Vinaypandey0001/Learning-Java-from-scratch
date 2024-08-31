/* Using a method, pass two variables and find the sum of two numbers.
Test case:
Number 1 – 20
Number 2 – 20.38
Sum = 40.38

There were a total of 4 test cases. Once you compile 3 of them will be shown to you and 1 will be a hidden one. You have to display error message if numbers are not numeric. 
*/

import java.util.Scanner;
class TCS_3_2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Number 1 : ");				
		int num1 = sc.nextInt();
		System.out.print("Number 2 : ");				
		float num2 = sc.nextFloat();
		float sum = num1 + num2;
		System.out.println("Sum = "+sum);
	}
}
