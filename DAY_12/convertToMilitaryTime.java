mport java.util.Scanner;

public class Main {
    public static String convertToMilitaryTime(String s) {
        // Extract the AM/PM part
        String period = s.substring(8);
        // Extract the hour, minute, and second parts
        String hour = s.substring(0, 2);
        String minute = s.substring(3, 5);
        String second = s.substring(6, 8);

        // Convert hour from 12-hour to 24-hour format
        int hourInt = Integer.parseInt(hour);
        if (period.equals("AM")) {
            if (hourInt == 12) {
                hourInt = 0; // Midnight case
            }
        } else if (period.equals("PM")) {
            if (hourInt != 12) {
                hourInt += 12; // Convert PM hour to 24-hour format
            }
        }

        // Format hour to 2-digit format
        String hour24 = String.format("%02d", hourInt);
        
        // Return the formatted 24-hour time
        return hour24 + ":" + minute + ":" + second;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        
        System.out.println(convertToMilitaryTime(s));
    }
}
