class Solution {
    public int lengthOfLongestSubstring(String input) {
        int n=input.length(),msize=0;
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
		return msize;
    }
}