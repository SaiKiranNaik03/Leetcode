class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int n = g.length;
        int m = s.length;

        int l,r;
        l=r=0;

        while(l<n && r<m){
            if(s[r] >= g[l]){
                l++;
            }
            r++;
        }
        return l;
    }
}