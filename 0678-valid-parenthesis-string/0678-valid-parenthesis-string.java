class Solution {
    public boolean checkValidString(String s) {
        int mini=0,maxi=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                mini++;
                maxi++;
            }
            else if(ch == ')'){
                mini--;
                maxi--;
            }
            else{
                mini--;
                maxi++;
            }
            if(mini < 0){
                mini = 0;
            }
            if(maxi < 0){
                return false;
            }
        }
        return (mini == 0)? true : false;
    }
}