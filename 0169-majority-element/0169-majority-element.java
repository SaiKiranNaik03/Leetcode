class Solution {
    public int majorityElement(int[] nums) {
        int c = 0;
        int num = -1;
        int n = nums.length;
        for(int ele : nums){
            if(c==0){
                num= ele;
                c=1; 
            }else if(num == ele) c++;
            else c--;
        }
        c=0;
        for(int ele : nums){
            if(num == ele) c++;
        }
        if(c > (n/2)) return num;
        return -1;
    }
}