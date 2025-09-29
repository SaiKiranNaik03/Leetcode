class Solution {
    public int beautySum(String s) {
        int n= s.length();
        int c = 0;
        for(int i=0;i<n;i++){
            int hash[] = new int[26];
            for(int j=i;j<n;j++){
                hash[s.charAt(j) - 'a']++;
                int maxi = Integer.MIN_VALUE;
                int mini = Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(hash[k] > 0){
                        maxi = Math.max(maxi,hash[k]);
                        mini = Math.min(mini,hash[k]);
                    }
                }
                c += maxi - mini;
            }
        }
        return c;
    }
}