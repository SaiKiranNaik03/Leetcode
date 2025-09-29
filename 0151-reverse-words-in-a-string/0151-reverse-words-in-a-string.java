class Solution {
    public String reverseWords(String s) {
        String arr[] = s.trim().split(" +");
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for(int i=n-1;i>=0;i--){
            sb.append(arr[i]);
            if(i!=0) sb.append(" ");
        }
        return sb.toString();
    }
}