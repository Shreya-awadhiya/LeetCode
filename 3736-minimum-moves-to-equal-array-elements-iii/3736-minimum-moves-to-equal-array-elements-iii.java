class Solution {
    public int minMoves(int[] nums) {
     
     int max = java.util.Arrays.stream(nums).max().getAsInt(); //5

     int count = 0;
     for(int i =0 ; i < nums.length;i++){
        count = count + (max - nums[i]);
     }
     return count;
    }
}