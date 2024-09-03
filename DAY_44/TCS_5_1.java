/* The selection of MPCS exams includes a fitness test which is conducted on the ground. There will be a batch of 3 trainees, appearing for a running test on track for 3 rounds.

You need to record their oxygen level after every round. After trainees are finished with all rounds, calculate for each trainee his average oxygen level over the 3 rounds and select the one with the highest average oxygen level as the fittest trainee. If more than one trainee attains the same highest average level, they all need to be selected. Display the fittest trainee(or trainers) and the highest average oxygen level.

Note:

1. The oxygen value entered should not be accepted if it is not in the range between 1 and 100.

2. If the calculated maximum average oxygen value of the trainees is below 70 then declare the trainees as unfit with a meaningful message as “All trainees are unfit”

3. Average oxygen values should be rounded






Example 1:

Input #1:

95

92

95

92

90

92

90

92

90

Output:

Trainee Number: 1

Trainee Number: 3

Note: Input should be 9 integer values representing oxygen levels entered in order as 

Round 1: 

Oxygen value of trainee 1

Oxygen value of trainee 2

Oxygen value of trainee 3

Round 2:

Oxygen value of trainee 1

Oxygen value of trainee 2 

Oxygen value of trainee 3

Round 3:

Oxygen value of trainee 1

Oxygen value of trainee 2

Oxygen value of trainee 3

Oxygen must be in the given format as in the above example. For any wrong input, the final output should display “INVALID INPUT”

Input #2:

91

92

45

92

80

90

90

92

90



TCS Ninja Coding Questions #5 - Solution and Output
*/


import java.util.Scanner;

public class TCS_5_1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize variables for clarity
        int count = 1;
        int x;
        double sum1 = 0, sum2 = 0, sum3 = 0;

        while (count <= 9) {
            // Prompt the user for input
            System.out.print("Enter an integer between 1 and 100 (or -1 to stop): ");
            x = sc.nextInt();

            // Validate input and handle stopping condition
            if (x == -1) {
                break; // Exit the loop if -1 is entered
            } else if (x < 1 || x > 100) {
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
                continue; // Skip to the next iteration if input is invalid
            }

            // Categorize the input based on count
            if (count % 3 == 1) {
                sum1 += x; // Add to sum1 if count is a multiple of 3
            } else if (count % 3 == 2) {
                sum2 += x; // Add to sum2 if count is one more than a multiple of 3
            } else {
                sum3 += x; // Add to sum3 if count is two more than a multiple of 3
            }
import java.util.Scanner;

public class TCS_5_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize variables for clarity
        int count = 1;
        int x;
        double sum1 = 0, sum2 = 0, sum3 = 0;

        while (count <= 9) {
            // Prompt the user for input
            System.out.print("Enter an integer between 1 and 100 (or -1 to stop): ");
            x = sc.nextInt();

            // Validate input and handle stopping condition
            if (x == -1) {
                break; // Exit the loop if -1 is entered
            } else if (x < 1 || x > 100) {
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
                continue; // Skip to the next iteration if input is invalid
            }

            // Categorize the input based on count
            if (count % 3 == 1) {
                sum1 += x; // Add to sum1 if count is a multiple of 3
            } else if (count % 3 == 2) {
                sum2 += x; // Add to sum2 if count is one more than a multiple of 3
            } else {
                sum3 += x; // Add to sum3 if count is two more than a multiple of 3
            }

            count++;
        }

        // Calculate and print the averages (handle potential division by zero)
        double avg1 = (count % 3 == 1) ? sum1 : 0; // Avoid division by zero for sum1
        double avg2 = (count % 3 == 2) ? sum2 : 0; // Avoid division by zero for sum2
        double avg3 = (count % 3 == 0) ? sum3 : 0; // Avoid division by zero for sum3 (count can't be 0)

        System.out.println("Average of first category: " + avg1);
        System.out.println("Average of second category: " + avg2);
        System.out.println("Average of third category: " + avg3);
    }
}
            count++;
        }

        // Calculate and print the averages (handle potential division by zero)
        double avg1 = (count % 3 == 1) ? sum1 : 0; // Avoid division by zero for sum1
        double avg2 = (count % 3 == 2) ? sum2 : 0; // Avoid division by zero for sum2
        double avg3 = (count % 3 == 0) ? sum3 : 0; // Avoid division by zero for sum3 (count can't be 0)

        System.out.println("Average of first category: " + avg1);
        System.out.println("Average of second category: " + avg2);
        System.out.println("Average of third category: " + avg3);
    }
}
