class Solution {
    static int[] findLH(int arr[]){
        int mini = arr[0];
        int s=0;
        for(int ele : arr){
            s+=ele;
            if(ele > mini){
                mini= ele;
            }
        }
        return new int[]{mini,s};
    }
    static boolean splitW(int arr[], int k, int mini){
        int done=1;;
        int tm=0;
        for(int t : arr){
            if(t + tm <= mini){
                tm+=t;
            }else{
                done++;
                tm=t;
            }
        }
        return done > k;
    }
    public int splitArray(int[] nums, int k) {
        int res[] = findLH(nums);
        int low = res[0];
        int high = res[1];
        while(low <= high){
            int mid =(low+high)/2;
            if(splitW(nums,k,mid)){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
}