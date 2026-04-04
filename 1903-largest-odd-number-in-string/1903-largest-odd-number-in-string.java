class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        String res = "";
        for(int i=n-1;i>=0;i--){
            int no = num.charAt(i) - '0';
            if(no%2 != 0){
                res = num.substring(0,i+1);
                break;
            }
        }
        return res;
    }
}