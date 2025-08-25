class Solution {
    public int fun(int[] nums) {
        int n = nums.length;
        int prev = nums[0];
        int prev2 = 0;
        for(int i=1;i<n;i++){
            int pick = nums[i];
            if(i-2 >= 0) pick += prev2;
            int nonpick = prev;

            int cur = Math.max(pick , nonpick);
            prev2 = prev;
            prev = cur;
        }
        return prev;
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int arr1[] = new int[n-1];
        int arr2[] = new int[n-1];
        int j=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(i != 0) arr1[j++] = nums[i];
            if(i != n-1) arr2[k++] = nums[i];
        }
        int res1 = fun(arr1);
        int res2 = fun(arr2);
        return Math.max(res1,res2);
    }
}