public class SumOfNumbersInString {
    public static int sumOfNumbers(String str) {
        int sum = 0;
        String temp = "0";
        
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                temp += ch;
            } else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        
        sum += Integer.parseInt(temp); // Add the last number, if any
        return sum;
    }

    public static void main(String[] args) {
        String input = "12abc34def56";
        int result = sumOfNumbers(input);
        System.out.println(result); // Output: 102
    }
}
