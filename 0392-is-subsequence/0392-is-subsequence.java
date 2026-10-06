class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // Pointer for s
        int j = 0; // Pointer for t

        // Dono strings par ek saath iterate karein
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; // Agar character match ho jaye toh s ka pointer aage badhayein
            }
            j++; // t ka pointer hamesha aage badhega
        }

        // Agar i poore s.length() tak pahunch gaya, matlab s ke saare characters t me order me mil gaye
        return i == s.length();
    }
}