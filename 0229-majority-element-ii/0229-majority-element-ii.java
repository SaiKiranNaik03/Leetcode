class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1,c2,ele1,ele2;
        c1=c2=0;
        ele1=ele2=Integer.MIN_VALUE;

        for(int ele : nums){
            if(c1 == 0 && ele != ele2){
                c1 = 1;
                ele1 = ele;
            }else if(c2 == 0 && ele != ele1){
                c2 = 1;
                ele2 = ele;
            }
            else if(ele1 == ele) c1++;
            else if(ele2 == ele) c2++;
            else{
                c1--;
                c2--;
            }
        }
        List<Integer> res = new ArrayList<>();
        c1 = c2 = 0;
        int mini = (nums.length/3)+1;
        for(int ele : nums){
            if(ele1 == ele) c1++;
            if(ele2 == ele) c2++;
        }
        if(c1 >= mini) res.add(ele1);
        if(c2 >= mini) res.add(ele2);
        return res;
    }
}