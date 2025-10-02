class Solution {
    static List<List<Integer>> res = new ArrayList<>();
    static void fun(int idx, int arr[], List<Integer> temp){
        if(idx == arr.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[idx]);
        fun(idx+1,arr,temp);
        temp.remove(temp.size()-1);
        fun(idx+1,arr,temp);
    }
    public List<List<Integer>> subsets(int[] nums) {
        res.clear();
        List<Integer> temp = new ArrayList<>();
        fun(0,nums,temp);
        return res;
    }
}