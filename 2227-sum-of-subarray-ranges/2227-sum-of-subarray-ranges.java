class Solution {
    public long subArrayRanges(int[] nums) {
        long total=0;
        for(int i=0;i<nums.length;i++){
            int min_ = nums[i];
            int max_ = nums[i];
            for(int j=i+1;j<nums.length;j++){
                min_ = Math.min(min_,nums[j]);
                max_ = Math.max(max_,nums[j]);
                total += (max_ - min_);
            }
        }
        return total;
    }
}