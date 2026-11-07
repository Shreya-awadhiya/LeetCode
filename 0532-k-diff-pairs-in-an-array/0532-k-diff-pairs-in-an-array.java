import java.util.Arrays;

class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0, j = 1, count = 0;
        
        while (i < nums.length && j < nums.length) {
            if (i == j || nums[j] - nums[i] < k) {
                j++;
            } else if (nums[j] - nums[i] > k) {
                i++;
            } else {
                count++;
                j++;
                while (j < nums.length && nums[j] == nums[j - 1]) {
                    j++;
                }
                i++;
                while (i < j && nums[i] == nums[i - 1]) {
                    i++;
                }
            }
        }
        return count;
    }
}