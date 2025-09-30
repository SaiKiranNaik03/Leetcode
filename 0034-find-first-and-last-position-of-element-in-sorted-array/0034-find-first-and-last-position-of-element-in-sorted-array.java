class Solution {
    int first(int arr[], int tar){
        int n = arr.length;
        int ans = -1;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == tar){
                ans = mid;
                high = mid -1;
            }else if(arr[mid] < tar){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        return ans;
    }
    int last(int arr[], int tar){
        int n = arr.length;
        int ans = -1;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == tar){
                ans = mid;
                low = mid + 1;
            }else if(arr[mid] < tar){
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums,target), last(nums, target)};
    }
}