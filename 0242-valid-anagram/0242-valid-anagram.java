class Solution {
    public boolean isAnagram(String s, String t) {
        int hash1[] = new int[26];
        int hash2[] = new int[26];
        int n = s.length();
        int m = t.length();
        if(m != n) return false;

        for(char ch : s.toCharArray()){
            hash1[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            hash2[ch - 'a']++;
        }

        for(char ch : s.toCharArray()){
            if(hash1[ch-'a'] != hash2[ch-'a']) return false;
        }
        return true;
    }
}