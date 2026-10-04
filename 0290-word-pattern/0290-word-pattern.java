class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String arr[] = s.split(" ");
        if (pattern.length() != arr.length) {
            return false;
        }
        HashMap<Character, String> hm = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            boolean containKey = hm.containsKey(ch);

            // Case 1: Key nahi hai par Word pehle se kisi aur Key ke paas hai
            if (!containKey && hm.containsValue(arr[i])) {
                return false;
            }
            // Case 2: Key pehle se hai par uska mapped Word current word se match NAHI kar raha
            if (containKey && !hm.get(ch).equals(arr[i])) {
                return false;
            }
            
            // Safe to put only if key doesn't exist yet
            if (!containKey) {
                hm.put(ch, arr[i]);
            }
        }
        return true;
    }
}