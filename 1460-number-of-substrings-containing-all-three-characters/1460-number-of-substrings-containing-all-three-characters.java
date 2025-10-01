class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int hash[] = new int[3];
        int l =0;
        int c=0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            hash[ch-'a']++;
            while(hash[0] > 0 && hash[1] > 0 && hash[2] > 0){
                c += n-i;
                hash[s.charAt(l)-'a']--;
                l++;

            }
        }
        return c;
    }
}