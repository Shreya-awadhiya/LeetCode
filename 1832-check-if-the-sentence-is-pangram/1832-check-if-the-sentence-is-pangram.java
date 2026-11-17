class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap <Character,Integer> hm = new HashMap<>();
        for(int i = 0 ; i<sentence.length() ; i++){
            char ch = sentence.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0) +1);
        }
        if(hm.size() == 26){
            return true;
        }
        return false;
    }
}