class Solution {
    static int findMax(int arr[]){
        int maxi = arr[0];
        for(int ele : arr){
            if(ele > maxi){
                maxi = ele;
            }
        }
        return maxi;
    }
    static int findVal(int arr[], int div){
        int total=0;
        for(int ele : arr){
            total += (int)Math.ceil((double)ele/div);
        }
        return total;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = findMax(nums);
        while(low <= high){
            int mid = (low+high)/2;
            int mini = findVal(nums, mid);
            if(mini > threshold){
                low = mid +1; 
            }else{
                high = mid-1;
            }
        }
        return low;
    }
}