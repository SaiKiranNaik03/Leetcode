class Solution {
    public String largestOddNumber(String s) {
        for(int i = s.length() - 1; i >= 0; i--){
            int num = s.charAt(i);
            if((num % 2) != 0){
                return s.substring(0, i + 1);
            }
        }
        return "";
    }
}