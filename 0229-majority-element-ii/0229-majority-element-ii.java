class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0,c2=0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        for(int ele : nums){
            if(c1 == 0 && ele2 != ele){
                c1=1;
                ele1=ele;
            }else if(c2==0 && ele1!=ele){
                c2=1;
                ele2=ele;
            }else if(ele == ele1){
                c1++;
            }else if(ele == ele2){
                c2++;
            }else{
                c1--;
                c2--;
            }
        }

        c1=0;c2=0;
        for(int ele : nums){
            if(ele == ele1) c1++;
            if(ele == ele2) c2++;
        }
        ArrayList<Integer> res =  new ArrayList<>();
        int mini = nums.length/3 + 1;
        if(c1 >= mini) res.add(ele1);
        if(c2 >= mini) res.add(ele2);

        return res;
    }
}