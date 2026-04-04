class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n == 1) return strs[0];
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[n-1];
        int m1 = first.length();
        int m2 = last.length();
        int i,j;
        i=j=0;
        while(i<m1 && j < m2 && first.charAt(i) == last.charAt(j)){
            i++;j++;
        }
        return first.substring(0,i);
    }
}