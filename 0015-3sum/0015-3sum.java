class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int i,j,k;
        List<List<Integer>> res= new ArrayList<>();
        for(i=0;i<n;i++){
            if(i!=0 && nums[i] == nums[i-1]) continue;
            j=i+1;
            k=n-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                    res.add(temp);
                    j++;
                    k--;
                    while(j<n && nums[j] == nums[j-1]) j++;
                    while(k>=0 && nums[k] == nums[k+1]) k--;
                }else if(sum > 0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return res;
    }
}