class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int ele1,ele2,cnt1,cnt2;
        ele1 = ele2 = cnt1 = cnt2 = 0;

        for(int ele : nums){
            if(cnt1 == 0 && ele != ele2){
                cnt1 = 1;
                ele1 = ele;
            }
            else if(cnt2 == 0 && ele != ele1){
                cnt2 =1;
                ele2 = ele;
            }
            else if(ele == ele1) cnt1++;
            else if(ele == ele2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> res = new ArrayList<>();
        cnt1 = cnt2 = 0;
        for(int ele : nums){
            if(ele == ele1) cnt1++;
            else if(ele == ele2) cnt2++;
        }
        if(cnt1 >= n/3+1) res.add(ele1);
        if(cnt2 >= n/3+1) res.add(ele2);
        return res;
    }
}