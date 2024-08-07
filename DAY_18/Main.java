public class Main {
  public static void main(String[] args) {
    // An array storing different ages
    int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

    float avg, sum = 0;

    // Get the length of the array
    int length = ages.length;
    
    // Create a 'lowest age' variable and assign the first array element of ages to it
    int lowestAge = ages[0];

    // Loop through the elements of the ages array to find the lowest age
    for (int age : ages) {
      // Check if the current age is smaller than the current 'lowest age'
      if (lowestAge > age) {
        // If the smaller age is found, update 'lowest age' with that element
        lowestAge = age;
      }
    }

    // Output the value of the lowest age
    System.out.println("The lowest age in the array is: " + lowestAge);
  }
}
