class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> ans = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            ans.put(nums[i], ans.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : ans.entrySet()) {
            int val = entry.getValue();
            count += (val * (val - 1)) / 2;
        }

        return count;
    }
}