import java.util.Scanner;
import java.util.HashMap;

public class AnagramChecker {

    public static boolean isAnagram(String a, String b) {
        // Convert both strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        // If lengths differ, they cannot be anagrams
        if (a.length() != b.length()) {
            return false;
        }
        
        // Create a frequency map for the first string
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char c : a.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Compare with the second string by decrementing frequencies
        for (char c : b.toCharArray()) {
            if (!frequencyMap.containsKey(c)) {
                return false; // If a character is not found, they're not anagrams
            }
            
            frequencyMap.put(c, frequencyMap.get(c) - 1);
            if (frequencyMap.get(c) == 0) {
                frequencyMap.remove(c); // Remove the character when its count reaches 0
            }
        }
        
        // If the map is empty, then the strings are anagrams
        return frequencyMap.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input two strings
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        // Check if they are anagrams
        boolean result = isAnagram(a, b);
        
        // Output the result
        if (result) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
        
        sc.close();
    }
}
