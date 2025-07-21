class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left =0;
        int right=0;
        int maxi = 0;
        int freq=0;
        int hash[] = new int[26];
        while(right < n){
            char ch = s.charAt(right);
            hash[ch-'A']++;
            freq = Math.max(freq,hash[ch-'A']);

            int diff = (right - left +1) - freq;
            if(diff > k){
                char ch1 = s.charAt(left);
                hash[ch1-'A']--;
                diff = (right - left + 1)-freq;
                left++;
            }
            int size = right - left +1;
            maxi = Math.max(size,maxi);
            right++;
        } 
        return maxi;
    }
}