class Solution {
    public int addedInteger(int[] num1, int[] num2) {
        /*if(nums[0]==nums2[0]){
            return 0;
        }*/
        int min1=num1[0],min2=num2[0];
        for(int i=1 ;i<num1.length ; i++){
            if(min1 < num1[i]){
                min1=num1[i];
            }
            if(min2 < num2[i]){
                min2=num2[i];
            }
        }
        return min2 - min1;
    }
}