class Solution {
    public boolean rotateString(String s, String goal) {
        char ch = goal.charAt(0);
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i) == ch){
                String rotated = s.substring(i) + s.substring(0, i);
                if(rotated.equals(goal)) return true;
            }
        }
        return false;
    }
}