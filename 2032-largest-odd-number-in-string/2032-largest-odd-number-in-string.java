class Solution {
    public String largestOddNumber(String num) {
        String res = "";
        int n = num.length();
        for(int i=n-1;i>=0;i--){
            int no = num.charAt(i) - 48;
            if(no%2 != 0){
                // System.out.println(no);
                res = num.substring(0,i+1);
                break;
            }
        }
        return res;
    }
}