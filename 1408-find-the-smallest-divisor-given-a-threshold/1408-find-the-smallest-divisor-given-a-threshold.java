class Solution {
    static int getSum(int nums[], int div){
        int total =0;
        for(int nu : nums){
            total += (int)Math.ceil((double)nu/div);
        }
        return total;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = -1;
        for(int no : nums) high = Math.max(high, no);

        while(low <= high){
            int mid = (low + high)/2;
            int sum = getSum(nums, mid);
            if(sum > threshold){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return low;
    }
}