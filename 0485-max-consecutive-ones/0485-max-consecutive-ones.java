class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int cnt = 0;
        int maxi = Integer.MIN_VALUE;
        for(int ele : nums){
            if(ele != 0) cnt++;
            else cnt=0;
            maxi = Math.max(maxi,cnt);
        }
        return maxi;
    }
}