class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int maj,cnt;
        cnt = 0;
        maj = 0;

        for(int ele : nums){
            if(cnt == 0){
                maj = ele;
                cnt = 1;
            }else if(ele == maj){
                cnt++;
            }else{
                cnt--;
            }
        }
        return maj;
    }
}