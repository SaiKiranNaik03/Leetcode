class Solution {
    public int findDuplicate(int[] nums) {
        int hash[] = new int[nums.length+1];
        for(int ele: nums){
            if(hash[ele] == 1){
                return ele;
            }
            hash[ele]++;
        }
        return -1;
    }
}