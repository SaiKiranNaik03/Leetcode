class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxi = 0;

        for (int ele : nums) {
            if (ele % 2 == 0) {
                int value = map.getOrDefault(ele, 0);
                map.put(ele, value + 1);
                maxi = Math.max(maxi, value + 1);
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key) == maxi) {
                res.add(key);
            }
        }

        if (res.size() == 0) {
            return -1;
        } else if (res.size() == 1) {
            return res.get(0);
        }

        Collections.sort(res);
        return res.get(0);
    }
}
