class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxi = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int last = nums[i];
            int c =1;
            for(int j=i+1;j<n;j++){
                if(nums[j] > last){
                    c++;
                    last = nums[j];
                }else{
                    break;
                }
            }
            maxi = Math.max(c,maxi);
        }
        return maxi;
    }
}