class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> hs = new HashSet<>();
        int left = 0;
        
        for (int i = 0; i < n; i++) {
            if (!hs.contains(s.charAt(i))) {
                hs.add(s.charAt(i));
                maxLength = Math.max(maxLength, i - left + 1);
            } else {
                while (hs.contains(s.charAt(i))) {
                    hs.remove(s.charAt(left));
                    left++;
                }
                hs.add(s.charAt(i));
            }
        }
        
        return maxLength;
    }
}