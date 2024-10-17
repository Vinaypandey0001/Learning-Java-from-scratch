public class SecondHighestFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 3, 1, 2, 1, 5, 3, 3, 5, 5};
        findSecondHighestFrequency(arr);
    }

    public static void findSecondHighestFrequency(int[] arr) {
        int highestFrequency = 0;
        int secondHighestFrequency = 0;

        // Step 1: Loop through the array to count frequencies
        for (int i = 0; i < arr.length; i++) {
            int count = 0; // Reset count for each unique element
            
            // Count frequency of arr[i]
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // Update highest and second highest frequencies
            if (count > highestFrequency) {
                secondHighestFrequency = highestFrequency;
                highestFrequency = count;
            } else if (count > secondHighestFrequency && count < highestFrequency) {
                secondHighestFrequency = count;
            }
        }

        // Step 2: Output the result
        if (secondHighestFrequency > 0) {
            System.out.println("Second highest frequency: " + secondHighestFrequency);
        } else {
            System.out.println("No second highest frequency found.");
        }
    }
}
