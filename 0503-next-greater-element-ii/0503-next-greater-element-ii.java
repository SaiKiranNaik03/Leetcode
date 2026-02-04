class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        Arrays.fill(res,-1);
        for(int i=0;i<n;i++){
            int curr = nums[i];
            for(int j=1;j<n;j++){
                if(nums[(i+j)%n] > curr){
                    res[i] = nums[(i+j)%n];
                    break;
                }
            }
        }
        return res;
    }
}