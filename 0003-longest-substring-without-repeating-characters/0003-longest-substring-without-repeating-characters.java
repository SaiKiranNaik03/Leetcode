class Solution {
    public int lengthOfLongestSubstring(String input) {
        //brute-force
        /*int n=input.length(),msize=0;
		for(int i=0;i<n;i++){
			int hashMap[]=new int[256];
			int size=0;
			for(int j=i;j<n;j++){
				int ch = input.charAt(j);
				if(hashMap[ch]==1){
					break;
				}
				size=j-i+1;
				hashMap[ch]=1;
				if(size > msize){
					msize = size;
				}
			}
		}
		return msize;*/
        
        //optimal
        int n= input.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=input.charAt(i);
            map.put(ch,-1);
        }
        int left=0,right=0,maxlen=0;
        
        while(right < n){
            char ch=input.charAt(right);
            if(map.get(input.charAt(right)) != -1 && map.get(ch)>= left){
                left=map.get(ch)+1;
            }
            int len=right-left+1;
            if(len > maxlen){
                maxlen=len;
            }
            map.put(ch,right);
            right++;
        }
        return maxlen;
        
    }
}