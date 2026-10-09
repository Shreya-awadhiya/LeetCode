class Solution {
    public int longestPalindrome(String s) {
        HashMap <Character,Integer> hm = new HashMap<>();

        boolean hasOdd = false;
        int length = 0;

        for(int i =0;i<s.length() ;i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0) +1 );
        }
        for(int count : hm.values()){
            if(count%2 == 0){
                length = length+count;
            }
            else{
                length = length + count -1;
                hasOdd= true;
            }
        }
        if(hasOdd){
            length = length+1;
        }
        return length;
    }
}