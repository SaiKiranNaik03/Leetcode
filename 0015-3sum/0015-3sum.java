class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        HashSet<List<Integer>> temp = new HashSet<>();
        
        for(int i=0;i<n;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int thr = -(nums[i]+nums[j]);
                if(set.contains(thr)){
                    List<Integer> tmp = new ArrayList<>(Arrays.asList(nums[i],nums[j],thr));
                    Collections.sort(tmp);
                    temp.add(tmp);
                }
                set.add(nums[j]);
            }
        }
        List<List<Integer>> res = new ArrayList<>(temp);
        return res;
    }
}