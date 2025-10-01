class Solution {
    int getC(int nums[], int k){
        int l,r,c,sum;
        l=r=c=sum=0;
        int n = nums.length;
        while(r < n){
            sum += nums[r]%2;
            while(sum > k){
                sum -= nums[l]%2;
                l++;
            }
            c += r-l+1;
            r++;
        }
        return c;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        if(k-1 < 0) return getC(nums,k);
        return getC(nums,k) - getC(nums,k-1);
    }
}