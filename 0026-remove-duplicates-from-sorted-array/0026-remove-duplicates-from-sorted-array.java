class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;

        for(int j=1;j<n;j++){
            if(nums[j] != nums[i]){
                i++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        return ++i;
    }
}