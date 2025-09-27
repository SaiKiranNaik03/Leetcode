class Solution {
    static void reverse(int arr[], int st, int ed){
        while(st < ed){
            int temp = arr[st];
            arr[st] = arr[ed];
            arr[ed] = temp;
            st++;
            ed--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int brk = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                brk = i;
                break;
            }
        }
        if(brk == -1){
            reverse(nums,0,n-1);
            return ;
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i] > nums[brk]){
                int temp = nums[brk];
                nums[brk] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        reverse(nums,brk+1,n-1);
        return;
    }
}