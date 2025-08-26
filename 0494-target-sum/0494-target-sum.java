// class Solution {
//     int fun(int idx, int nums[], int target, int dp[][]){
//         if(idx == 0){
//             if(target == 0 && nums[idx] == 0) return 2;
//             else if(target == 0 || nums[idx] == target) return 1;
//             else return 0;
//         }
//         if(dp[idx][target] != -1) return dp[idx][target];

//         int notpick = fun(idx-1,nums,target,dp);
//         int pick = 0;
//         if(nums[idx] <= target){
//             pick = fun(idx-1,nums,target-nums[idx],dp);
//         }
//         return dp[idx][target] = pick + notpick;
//     }
//     public int findTargetSumWays(int[] nums, int target) {
//         int sum = 0;
//         int n = nums.length;
//         int s1 = (sum - target)/2;
//         for(int ele : nums) sum += ele;
//         int dp[][] = new int[n][s1+1];
//         for(int ro[] : dp) Arrays.fill(ro,-1);
//         if((sum-target) < 0 || (sum - target) % 2!=0) return 0;
//         return fun(n-1,nums,s1,dp);
//     }
// }

class Solution {
    int fun(int idx, int nums[], int target, int dp[][]){
        if(idx == 0){
            if(target == 0 && nums[0] == 0) return 2; 
            if(target == 0 || nums[0] == target) return 1;
            return 0;
        }
        if(dp[idx][target] != -1) return dp[idx][target];

        int notpick = fun(idx-1, nums, target, dp);
        int pick = 0;
        if(nums[idx] <= target){
            pick = fun(idx-1, nums, target-nums[idx], dp);
        }
        return dp[idx][target] = pick + notpick;
    }

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0, n = nums.length;
        for(int ele : nums) sum += ele;

        if((sum - target) < 0 || (sum - target) % 2 != 0) return 0;
        int s1 = (sum - target) / 2;

        int dp[][] = new int[n][s1+1];
        for(int[] row : dp) Arrays.fill(row, -1);

        return fun(n-1, nums, s1, dp);
    }
}
