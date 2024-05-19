class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max1=0,c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
                if(c>max1){
                    max1=c;
                }
            }
            else{
                c=0;
            }
        }
        return max1;
    }
}