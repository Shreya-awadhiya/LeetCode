class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for(int i = 0;i<candies.length ;  i++){
            int s = candies[i] + extraCandies;
            if(s >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}
