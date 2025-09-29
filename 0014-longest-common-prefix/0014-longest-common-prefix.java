class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        String s1 = strs[0];
        String s2 = strs[n-1];
        int len = s1.length();

        String res ="";
        int i=0;
        while( i < len){
            if(s1.charAt(i) == s2.charAt(i)){
                res += s1.charAt(i);
                i++;
            }else{
                break;
            }
        }
        return res;
    }
}