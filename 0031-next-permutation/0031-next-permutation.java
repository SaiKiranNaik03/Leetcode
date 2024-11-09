class Solution {
    
    public static void swap(int nums[],int i,int j){
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }
    public static void reverse(int nums[],int start,int end){
        while(start < end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int idx=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx == -1){
            reverse(nums,0,nums.length-1);
            return ;
        }
        
        for(int i=nums.length-1;i>idx;i--){
            if(nums[i] > nums[idx]){
                swap(nums,i,idx);
                break;
            }
        }
        reverse(nums,idx+1,nums.length-1);
    }
}