public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        
        // Calculate the sum of first B elements from the left
        int currentSum = 0;
        for (int i = 0; i < B; i++) {
            currentSum += A[i];
        }
        
        // This will store the maximum sum we can get
        int maxSum = currentSum;
        
        // Now, try taking some elements from the right and reducing from the left
        int rightSum = 0;
        for (int i = 0; i < B; i++) {
            rightSum += A[n - 1 - i];  // Add element from the right
            currentSum -= A[B - 1 - i];  // Remove element from the left
            
            maxSum = Math.max(maxSum, currentSum + rightSum);
        }
        
        return maxSum;
    }
}
