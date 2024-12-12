class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int key = nums.length/3 +1;
        List<Integer> lst = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele, 0) + 1);
            if(map.get(ele) == key){
                lst.add(ele);
            }
            if(lst.size() == 2){
                break;
            }
        }
        return lst;
    }
}