public class CommonSubsequences {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        
        int count = countCommonSubsequences(str1, str2, str1.length(), str2.length());
        System.out.println("Count of common subsequences: " + count);
    }

    public static int countCommonSubsequences(String str1, String str2, int m, int n) {
        if (m == 0 || n == 0) {
            return 1;
        }
        if (str1.charAt(m - 1) == str2.charAt(n - 1)) {
            return countCommonSubsequences(str1, str2, m - 1, n - 1) + countCommonSubsequences(str1, str2, m, n - 1);
        } else {
            return countCommonSubsequences(str1, str2, m, n - 1);
        }
    }
}
