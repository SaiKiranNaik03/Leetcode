import java.util.*;
class Solution {
    public int majorityElement(int[] nums){
        int l=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        int ele=0;
        for(int key : map.keySet()){
            if(map.get(key) > l/2){
                ele=key;
            }
        }
        return ele;
    }
}