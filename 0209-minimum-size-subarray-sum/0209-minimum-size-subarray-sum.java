class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0 , l =0 , r = 0;
       int res = Integer.MAX_VALUE;

        while(r < nums.length){
            sum = sum + nums[r];
            while(sum >= target){
                 int length = r - l +1;
                res = Math.min(res,length);
                sum = sum - nums[l];
                l++;
               
            }
            r++;
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}