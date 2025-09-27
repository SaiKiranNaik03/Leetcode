class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int hash[] = new int[n];
        for(int ele : nums){
            hash[ele]++;
        }
        int res = -1;
        for(int i=1;i<n;i++){
            if(hash[i] >= 2) res = i;
        }
        return res;
    }
}