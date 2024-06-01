class Solution {
    public int numberOfSubstrings(String s) {
        int prev[]=new int[]{-1,-1,-1};
        int n=s.length(),count=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            prev[ch-'a']=i;
            if(prev[0]!= -1 && prev[1]!= -1 && prev[2]!= -1){
                count+=Math.min(Math.min(prev[0],prev[1]),prev[2])+1;
            }
        }
        return count;
    }
}