class Solution {
    static int getCount(int arr[],int k){
        int left=0;
        int right=0;
        int n = arr.length;
        int sum=0;
        int c=0;
        while(right < n){
            sum += arr[right];
            while(sum > k){
                sum-=arr[left];
                left++;
            }
            if(sum <= k) c+=(right - left +1);
            right++;
        }
        return c;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        if(goal - 1 < 0) return getCount(nums,goal);
        return getCount(nums,goal) - getCount(nums,goal - 1);
    }
}