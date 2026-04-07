class Solution {
    public int jump(int[] nums) {
        int l,r;
        l=r=0;
        int n = nums.length;
        int far =0;
        int jump=0;
        while(r < n-1){
            for(int i=l;i<=r;i++){
                far = Math.max(far,i+nums[i]);
            }
            l = r+1;
            r=far;
            jump++;
        }
        return jump;
    }
}