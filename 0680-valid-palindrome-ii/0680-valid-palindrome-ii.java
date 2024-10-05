class Solution {
    private boolean isPalindrome(char[] str, int i, int j){
        while(i<j){
            if(str[i] != str[j]) return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        if(s.length() == 1) return true;
        if(s.length() == 2){
            return true;
        }
        char[] str = s.toCharArray();
        int n = str.length;
        int i=0;
        int j = n-1;
        while(i<j){
            if(str[i] != str[j]){
                return isPalindrome(str, i, j-1) || isPalindrome(str, i+1, j);
            }else{
                i++;
                j--;
            }
        }
        return true;
        
    }
}