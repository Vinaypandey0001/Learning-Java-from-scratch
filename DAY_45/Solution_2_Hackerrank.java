import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Solution_2_Hackerrank {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // Reading and printing 3 integers
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(reader.readLine());
            System.out.println(num);
        }
    }
}
