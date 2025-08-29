class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int dp[] = new int[n];
        Arrays.fill(dp,1);
        int hash[] = new int[n];
        int maxi = 1;
        int last_idx = 0;
        for(int i=0;i<n;i++){
            hash[i] = i;
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j] == 0 && dp[j] + 1 > dp[i]){
                    dp[i] = dp[j]+1;
                    hash[i] = j;
                }
            }
            if(dp[i] > maxi){
                maxi = dp[i];
                last_idx = i;
            }
        }
        List<Integer> res = new ArrayList<>();
        res.add(nums[last_idx]);
        while(hash[last_idx] != last_idx){
            res.add(nums[hash[last_idx]]);
            last_idx = hash[last_idx];
        }
        return res;
    }
}