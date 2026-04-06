class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l,r;
        int maxi = 0;
        l=0;
        r=0;
        while(r < s.length()){
            char ch = s.charAt(r);
            if(map.containsKey(ch)) l = Math.max(l,map.get(ch)+1);

            map.put(ch,r);
            maxi = Math.max(maxi,r-l+1);
            r++;
        }
        return maxi;
    }
}