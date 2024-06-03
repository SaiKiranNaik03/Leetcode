class Solution {
    public static int goodArray(int nums[],int k){
        int n = nums.length;
        int left=0,right=0,count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(right < n){
            // if(map.containsKey(nums[right])){
            //     map.put(nums[right],map.get(nums[right])+1);
            // }
            // else{
            //     map.put(nums[right],1);
            // }
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size() > k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            count += (right-left+1);
            right++;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return goodArray(nums,k) - goodArray(nums,k-1);
    }
}