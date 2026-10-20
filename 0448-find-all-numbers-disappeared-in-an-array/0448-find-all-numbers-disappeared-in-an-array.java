class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        
        // Step 1: Add all elements of nums into the HashSet
        for (int num : nums) {
            hs.add(num);
        }
        
        // Step 2: Check which numbers from 1 to n are missing in the set
        for (int i = 1; i <= nums.length; i++) {
            if (!hs.contains(i)) {
                ans.add(i);
            }
        }
        
        return ans;
    }
}