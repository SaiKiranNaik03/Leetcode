class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> res= new ArrayList<>();
        int hash[] = new int[n+1];
        for(int x : nums) hash[x]++;

        for(int i=1;i<n+1;i++){
            if(hash[i] == 0) res.add(i);
        }
        return res;
    }
}