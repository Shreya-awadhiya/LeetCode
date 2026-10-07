class Solution {
    public int[] sortedSquares(int[] A) {
       int out[] = new int [A.length];
       int i = 0;
       int j = 0;

       while(i < A.length && j < out.length){
        int sqr = A[i] * A[i];
        out[j] = sqr;
        i++;
        j++;
       }
       Arrays.sort(out);
       return out;
    }
}