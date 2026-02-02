class Solution {
    public boolean isAnagram(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        if(n1 != n2) return false;
        int hash1[] = new int[26];
        int hash2[] = new int[26];

        for(int i=0;i<n1;i++){
            int ch1 = s.charAt(i) - 'a';
            int ch2 = t.charAt(i) - 'a';
            hash1[ch1]++;
            hash2[ch2]++;
        }
        for(int i=0;i<26;i++){
            if(hash1[i] != hash2[i]) return false;
        }
        return true;
    }
}