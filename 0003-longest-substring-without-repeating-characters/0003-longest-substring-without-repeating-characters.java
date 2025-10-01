class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n =s.length();
        if(n == 0) return 0;
        int maxi = 1;
        int l ,r;
        l=r=0;
        for(r=0;r<s.length();r++){
            char ch = s.charAt(r);
            if(set.contains(ch)){
                while(l < n && set.contains(ch)){
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            set.add(ch);
            maxi = Math.max(maxi,r-l+1);
        }
        return maxi;
    }
}