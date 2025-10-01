class Solution {
    int getCount(int nums[], int tar){
        int l,r,sum,c;
        l=r=sum=c=0;
        int n = nums.length;
        while(r < n){
            sum += nums[r];

            while(l < n && sum > tar){
                sum -= nums[l];
                l++;
            }
            if(sum <= tar) c+= r-l+1;
            r++;
        }
        return c;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        // int c,sum;
        // sum = c = 0;
        // int n = nums.length;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // map.put(0,1);

        // for(int i=0;i<n;i++){
        //     sum += nums[i];

        //     int rem = sum - goal;
        //     c += map.getOrDefault(rem,0);

        //     map.put(sum,map.getOrDefault(sum,0)+1);
        // }
        // return c;
        if(goal-1 < 0) return getCount(nums,goal);
        return getCount(nums, goal) - getCount(nums,goal-1);
    }
}