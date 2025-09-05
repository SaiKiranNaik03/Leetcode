class Solution {
    public char findTheDifference(String s, String t) {
        int hash[] = new int[26];
        for(char ch : s.toCharArray()){
            hash[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            hash[ch-'a']++;
        }
        int res = -1;
        for(int i=0;i<26;i++){
            if(hash[i]%2==1){
                res = i;
                break;
            }
        }
        return (char)(res + 'a');
    }
}