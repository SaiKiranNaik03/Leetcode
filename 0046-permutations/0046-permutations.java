class Solution {
    public void getPermutations(int nums[], List<Integer> ds, List<List<Integer>> ans, boolean freq[]){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0 ; i<nums.length ; i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                getPermutations(nums, ds, ans, freq);
                ds.removeLast();
                freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        getPermutations(nums, ds, ans, freq);
        return ans;
    }
}