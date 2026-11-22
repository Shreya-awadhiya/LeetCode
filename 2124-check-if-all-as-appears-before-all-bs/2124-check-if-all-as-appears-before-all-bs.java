class Solution {
    public boolean checkString(String s) {
        char arr[] = s.toCharArray();
        int i = 0 , j = i+1;
        while(j <= s.length()-1){
            if(arr[i] == 'b' && arr[j] == 'a'){
                return false;
            }
            else{
                i++;
                j++;
            }
        }
        return true;
    }
}