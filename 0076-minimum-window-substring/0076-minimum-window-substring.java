class Solution {
    public String minWindow(String s, String t) {
        int left , right, start,cnt;
        left = right = cnt = start = 0;
        int mini = Integer.MAX_VALUE;
        int n = s.length();
        int m = t.length();
        if(m > n) return "";
        int hash[] = new int[256];
        for(int i=0;i<m;i++){
            char ch = t.charAt(i);
            hash[ch]++;
        }
        while(right < n){
            char ch = s.charAt(right);
            if(hash[ch] > 0)cnt++;
            hash[ch]--; 
            while(cnt == m){
                int size = right - left +1;
                if(size < mini){
                    mini = size;
                    start = left;
                }
                char ch1= s.charAt(left);
                hash[ch1]++;
                if(hash[ch1] > 0) cnt--;
                left++;
            }
            right++;
        }
        if(mini == Integer.MAX_VALUE) return ""; 
        return s.substring(start,start+mini);
    }
}