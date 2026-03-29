class Solution {
    public boolean checkValidString(String s) {
        int n = s.length();
        int mini=0;
        int maxi=0;

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '('){
                mini++;
                maxi++;
            }else if(ch == ')'){
                mini--;
                maxi--;
            }else{
                mini--;
                maxi++;
            }
            if(mini < 0) mini=0;
            if(maxi < 0) return false;
        }
        return mini == 0;
    }
    
}