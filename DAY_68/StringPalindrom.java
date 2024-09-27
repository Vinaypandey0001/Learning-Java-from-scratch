import java.io.*;
import java.util.Arrays;
class StringPalindrom {
  static private boolean isPalindrome(String s) {
    int left = 0, right = s.length()-1;
        while(left<right)
        {
            char l = s.charAt(left), r = s.charAt(right);
            if(!Character.isLetterOrDigit(l)) 
                left++;
            else if(!Character.isLetterOrDigit(r)) 
                right--;
            else if(Character.toLowerCase(l)!=Character.toLowerCase(r)) 
                return false;
            else {
                left++; 
                right--;
            }
        }
        return true;
  }
  public static void main(String[] args) {
    String str = "ABCDCBA";
    boolean ans = isPalindrome(str);

    if (ans == true) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    }
  }
}
