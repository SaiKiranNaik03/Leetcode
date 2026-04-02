class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int i,j,k,l;
        List<List<Integer>> res = new ArrayList<>();
        for(i=0;i<n;i++){
            if(i!=0 && nums[i] == nums[i-1]) continue;
            for(j=i+1;j<n;j++){
                if(j!=i+1 && nums[j] == nums[j-1]) continue;
                k=j+1;
                l=n-1;
                while(k < l){
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum == target){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j] ,nums[k] , nums[l]);
                        res.add(temp);
                        k++;
                        l--;
                        while(k < n && nums[k] == nums[k-1]) k++;
                        while(l>=0 && nums[l] == nums[l+1]) l--;
                    }else if(sum > target) l--;
                    else k++;
                }
            }
        }
        return res;
    }
}