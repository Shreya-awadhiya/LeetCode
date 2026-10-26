class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        for(int l = 0;l <= arr.length- k ; l++){
            int sum =0;
            for(int r = l; r < l + k ; r++){
                
                sum= sum + arr[r];
            }
            if(sum >= k * threshold ){
                count++;
            }
            else{}
        }
        return count;
    }
}