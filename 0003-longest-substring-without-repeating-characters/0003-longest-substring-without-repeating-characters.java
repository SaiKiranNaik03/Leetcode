class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n =s.length();
        int maxi = 0;
        int l ,r;
        l=r=0;
       while(r < n){
        if(map.containsKey(s.charAt(r))) l = Math.max(l, map.get(s.charAt(r)) + 1);

        map.put(s.charAt(r), r);
        maxi = Math.max(maxi,r-l+1);
        r++;
       }
        return maxi;
    }
}