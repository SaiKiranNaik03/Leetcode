class Solution {
    public void reverse(int nums[], int st, int ed){
        while(st <= ed){
            int temp = nums[ed];
            nums[ed] = nums[st];
            nums[st] = temp;
            st++;
            ed--;
        }
        return;
    }
    public void nextPermutation(int[] nums) {
        int brk = -1;
        int n = nums.length;

        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                brk = i;
                break;
            }
        }
        if(brk == -1){
            reverse(nums,0,n-1);
            return;
        }
        
        for(int i=n-1;i>=brk;i--){
            if(nums[i] > nums[brk]){
                int temp = nums[i];
                nums[i] = nums[brk];
                nums[brk] = temp;
                break;
            }
        }
        reverse(nums,brk+1,n-1);
        return;
    }
}