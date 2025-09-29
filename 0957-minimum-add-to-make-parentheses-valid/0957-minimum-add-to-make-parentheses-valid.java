class Solution {
    public int minAddToMakeValid(String s) {
        int c,o;
        c = o = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                o++;
            }
            else{
                if(o > 0) o--;
                else c++;
            }
        }
        return c+o;
    }
}