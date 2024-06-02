class Solution {
    public int subarray(int nums[],int goal){
        int left=0,right=0,sum=0;
        int subcount=0;
        int n=nums.length;
        while(right < n){
            sum+=nums[right]%2;
            while(sum > goal){
                sum-=nums[left]%2;
                left++;
            }
            subcount+= (right -left+1);
            right++;
        }
        return subcount;
    }
    public int numberOfSubarrays(int[] nums, int k){
        if(k -1 < 0){
            return subarray(nums,k);
        }
        return subarray(nums,k) - subarray(nums,k-1);
    }
}