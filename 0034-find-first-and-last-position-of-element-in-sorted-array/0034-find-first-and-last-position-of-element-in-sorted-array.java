class Solution {
    static int first(int arr[], int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == x){
                ans = mid;
                high = mid-1;
            }else if(arr[mid] > x){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    static int last(int arr[], int x){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == x){
                ans = mid;
                low = mid+1;
            }else if(arr[mid] > x){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        return new int[] {first(nums, target), last(nums, target)};
    }
}