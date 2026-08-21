class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {

            int mid = l + (r - l) / 2;

            if (nums[mid] < nums[r]) {
                r = mid;
            }
            else {
                l = mid + 1;
            }
        }

        return nums[l];
    }
}
















// class Solution {
//     public int findMin(int[] nums) {
//         int low = 0 , high = nums.length;

//         int mid = low + (high-low)/2;

//         while(low<high){
//             if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1]){
//                 low = mid +1;
//             }
//             else if(nums[mid] < nums[mid+1] && nums[mid] > nums[mid-1]){
//               high = mid-1;
//             }
//             else{
//                 return nums[mid];
//             }
//         }
//         return 1;
//     }
// }