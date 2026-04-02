class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            HashSet<Integer> st = new HashSet<>();

            for(int j=i+1;j<n;j++){
                int rem = -(nums[i] + nums[j]);

                if(st.contains(rem)){
                    List<Integer> temp =  Arrays.asList(nums[i],nums[j],rem);
                    Collections.sort(temp);
                    set.add(temp);
                }
                st.add(nums[j]);
            }
        }
        List<List<Integer>> res = new ArrayList<>(set);
        return res;
    }
}