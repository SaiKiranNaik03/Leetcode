class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int hash[] = new int[n+1];
        for(int ele : nums) hash[ele]++;

        for(int i=0;i<=n;i++){
            if(hash[i] >= 2) return i;
        }
        return -1;
    }
}