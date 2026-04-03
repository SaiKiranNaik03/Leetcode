class Solution {
    int getM(int nums[], int sum){
        int total,c;
        total=c=0;
        for(int n : nums){
            if(c+n <= sum){
                c+=n;
            }else{
                total++;
                c=n;
            }
        }
        return total;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = -1;
        int high = 0;
        for(int no : nums){
            low = Math.min(low,no);
            high+=no;
        }

        while(low <= high){
            int mid = (low+high)/2;
            int res = getM(nums,mid);
            if(res >= k){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
}