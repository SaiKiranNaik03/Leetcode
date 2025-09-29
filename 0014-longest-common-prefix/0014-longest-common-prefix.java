class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int n = strs.length;
        String str1 = strs[0];
        String str2 = strs[n-1];
        int len = str1.length();
        int i=0;
        while(i<len && str1.charAt(i) == str2.charAt(i))i++;
        return str1.substring(0,i);

    }
}