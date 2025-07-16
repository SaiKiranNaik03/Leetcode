class Solution {
    public int maxProduct(int[] nums) {
        int n =nums.length;
        int pref = 1;
        int suf = 1;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            pref = pref * nums[i];
            suf *= nums[n - i -1];

            maxi = Math.max(maxi,Math.max(pref,suf));

            if(pref == 0) pref = 1;
            if(suf == 0) suf = 1;
            
        }
        return maxi;
    }
}