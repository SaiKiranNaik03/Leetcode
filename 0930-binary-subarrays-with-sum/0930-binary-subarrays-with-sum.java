class Solution {
    public int subarray(int nums[],int goal){
        int left=0,right=0,sum=0;
        int subcount=0;
        int n=nums.length;
        while(right < n){
            sum+=nums[right];
            while(sum > goal){
                sum-=nums[left];
                left++;
            }
            subcount+= (right -left+1);
            right++;
        }
        return subcount;
        
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        if(goal<0){
            return 0;
        }
        if(goal -1 < 0){
            return subarray(nums,goal);
        }
        return subarray(nums,goal) - subarray(nums,goal-1);
    }
}