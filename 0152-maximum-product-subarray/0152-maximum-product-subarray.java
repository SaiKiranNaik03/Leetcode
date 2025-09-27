class Solution {
    public int maxProduct(int[] nums) {
        int left=1;
        int right =1;
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            left *= nums[i];
            right *= nums[n-i-1];

            maxi = Math.max(maxi, Math.max(left,right));

            if(left == 0) left =1;
            if(right == 0) right = 1;

        }
        return maxi;
    }
}