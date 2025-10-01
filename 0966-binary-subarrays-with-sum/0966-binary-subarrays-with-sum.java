class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // int l,r;
        // l=r=0;
        // int c=0;
        // int sum=0;
        // int n = nums.length;

        // while(r < n){
        //     sum += nums[r];

        //     while(sum > goal){
        //         sum -= nums[l];
        //         l++;
        //     }
        //     if(sum <= goal) c = r-l+1;

        //     r++;
        // }
        // return c;
        int c,sum;
        sum = c = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        for(int i=0;i<n;i++){
            sum += nums[i];

            int rem = sum - goal;
            c += map.getOrDefault(rem,0);

            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return c;
    }
}