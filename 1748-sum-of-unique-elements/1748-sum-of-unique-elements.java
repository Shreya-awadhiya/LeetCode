class Solution {
    public int sumOfUnique(int[] nums) {
        int r = 0;
        int[] freq = new int[100];
        for(int c : nums) {
            freq[c-1]++;
        }
        for(int i = 0; i < 100; i++) {
            if(freq[i] == 1) r += i+1;
        }
        return r;
    }
}