class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0,c2=0;
        int ele1,ele2;
        ele1 = ele2 = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(c1 == 0 && nums[i] != ele2){
                c1++;
                ele1 = nums[i];
            }
            else if(c2 == 0 && nums[i] != ele1){
                c2++;
                ele2 = nums[i];
            }
            else if(nums[i] == ele1){
                c1++;
            }
            else if(nums[i] == ele2){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        List<Integer> ls = new ArrayList<>();
        c1 = 0; c2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ele1) c1++;
            if (nums[i] == ele2) c2++;
        }

        int mini = (nums.length / 3) + 1;
        if (c1 >= mini) ls.add(ele1);
        if (c2 >= mini) ls.add(ele2);
        return ls;
    }
}