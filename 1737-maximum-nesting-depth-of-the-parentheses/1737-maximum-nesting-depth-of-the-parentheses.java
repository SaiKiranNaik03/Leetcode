class Solution {
    public int maxDepth(String s) {
        String params = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch ==')') params += ch;
        }
        int c=0;
        int maxi = 0;
        for(int i=0;i<params.length();i++){
            char ch = params.charAt(i);
            if(ch == '(') c++;
            else{
              maxi = Math.max(maxi,c);
              c--;  
            } 
        }
        return maxi;
    }
}