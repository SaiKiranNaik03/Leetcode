class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l,r,z;
        l=r=z=0;
        int maxi = 0;
        while(r<n){
            if(nums[r] == 0) z++;
            if(z > k){
                if(nums[l] == 0) z--;
                l++;
            }
            if(z <= k){
                maxi = Math.max(maxi,r-l+1);
            }
            r++;
        }
        return maxi;
    }
}