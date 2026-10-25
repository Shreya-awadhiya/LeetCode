class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        
        // Pehle k elements ka sum nikalo
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        double maxSum = sum;
        
        // Sliding window se aage ke elements ke liye sum update karo
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum / k;
    }
}