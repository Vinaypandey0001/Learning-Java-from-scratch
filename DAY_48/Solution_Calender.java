import java.util.Scanner;
import java.util.Calendar;
import java.util.Locale;

public class Solution_Calender {

    public static String findDay(int month, int day, int year) {
        // Create a Calendar instance
        Calendar cal = Calendar.getInstance();
        
        // Set the calendar to the provided date
        cal.set(year, month - 1, day); // Month is 0-based in Calendar (January is 0, February is 1, etc.)
        
        // Get the day of the week as a string in uppercase
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH).toUpperCase();
    }
    
    public static void main(String[] args) {
        // Scanner to read input
        Scanner scanner = new Scanner(System.in);
        
        // Read input format: month, day, year (separated by spaces)
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        
        // Output the day of the week
        System.out.println(findDay(month, day, year));
        
        // Close scanner
        scanner.close();
    }
}
