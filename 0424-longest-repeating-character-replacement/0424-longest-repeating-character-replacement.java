class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0;
        int right =0;
        int hash[] = new int[26];
        int maxi = 0;
        int freq = 0;
        while(right < n){
            char ch = s.charAt(right);
            hash[ch - 'A']++;
            freq = Math.max(freq,hash[ch-'A']);
            int diff = (right - left +1) - freq;

            if(diff > k){
                char ch1 = s.charAt(left);
                hash[ch1-'A']--;
                freq = Math.max(freq,hash[ch1-'A']);
                diff = (right-left+1)-freq;
                left++;
            }
            maxi = Math.max(maxi,right-left+1);
            right++;
        }
        return maxi;
    }
}
