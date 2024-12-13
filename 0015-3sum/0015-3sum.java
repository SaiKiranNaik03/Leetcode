class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<ArrayList<Integer>> set = new HashSet<>();

        int n = nums.length;
        for(int i=0;i<n;i++){
            HashSet<Integer> st = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third = -(nums[i]+nums[j]);
                if(st.contains(third)){
                    if(third + nums[i]+ nums[j] == 0){
                        ArrayList<Integer> res = new ArrayList(Arrays.asList(nums[i], nums[j], third));
                        Collections.sort(res);
                        set.add(res);
                    }
                }
                st.add(nums[j]);
            }
        }

        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }
}