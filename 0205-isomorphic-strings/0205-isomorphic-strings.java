class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        int[] mapStoT=new int[256];
        int[] mapTtoS=new int[256];
        for(int i=0;i<s.length();i++){
            char cs=s.charAt(i);
            char ct=t.charAt(i);
            if(mapStoT[cs]!=mapTtoS[ct])return false;

            mapStoT[cs]=i+1;
            mapTtoS[ct]=i+1;
        }
    
    return true;
    }
}