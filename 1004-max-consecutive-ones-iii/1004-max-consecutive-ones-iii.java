class Solution {
    public int longestOnes(int[] nums, int k) {
        /*int n=nums.length;
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
        return maxlen;*/
        int l=0,r=0,max=0,zero=0,n=nums.length;
        while(r<n){
            if(nums[r]==0) zero++;
            if(zero>k){
            if(nums[l]==0) zero--;
                l++;
            }
            if(zero<=k){
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
    }
}