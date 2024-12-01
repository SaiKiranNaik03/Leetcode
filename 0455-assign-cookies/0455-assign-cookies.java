class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0,r=0,c=0;
        while(l<g.length && r<s.length){
            if(s[r] >= g[l]){
                c++;
                l++;
                r++;
            }
            else if(s[r] < g[l]){
                r++;
            }
            else{
                l++;
            }
        }
        return c;
    }
}