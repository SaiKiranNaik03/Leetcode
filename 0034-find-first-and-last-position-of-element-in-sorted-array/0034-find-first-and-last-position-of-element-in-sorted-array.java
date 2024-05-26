class Solution {
    public int lowerBound(int arr[],int target){
        int low=0,high=arr.length-1;
        int idx1=-1;
        while(low <= high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                idx1=mid;
                high=mid-1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return idx1;
        
    }
    public int upperBound(int arr[],int target){
        int low=0,high=arr.length-1;
        int idx2=-1;
        while(low <= high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                idx2=mid;
                low=mid+1;
            }
            else if(arr[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return idx2;
        
    }
    public int[] searchRange(int[] nums, int target) {
        int res[]=new int[2];
        if(nums.length==0){
            res[0]=-1;
            res[1]=-1;
            return res;
        }
        int lb=lowerBound(nums,target);
        int ub=upperBound(nums,target);
       
        res[0]=lb;
        res[1]=ub;
        return res;
    }
}