class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int maxlen=0,left=0,right=0;
        int zero=0;
        while(right < n){
            if(nums[right]==0){
                zero++;
            }
            while(zero > k){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            if(zero <= k){
                int len=right-left+1;
                if(len > maxlen){
                    maxlen=len;
                }
            }
            right++;
        }
        return maxlen;
    }
}