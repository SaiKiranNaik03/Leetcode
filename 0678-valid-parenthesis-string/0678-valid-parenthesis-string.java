class Solution {
    public boolean checkValidString(String s) {
        int mini,maxi;
        mini = maxi =0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                mini ++;
                maxi++;
            }else if(ch == ')'){
                mini--;
                maxi--;
            }else{
                mini--;
                maxi++;
            }
            if(mini < 0) mini = 0;
            if(maxi < 0) return false;
        }
        return mini == 0;
    }
}