class Solution {
    public static int getMax(int nums[],int i){
        int maxi = nums[i];
        for(int j=i;j<nums.length;j++){
            if(nums[j] > maxi){
                maxi=nums[j];
            }
        }
        return maxi;
    }
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            int m = getMax(arr,i+1);
            arr[i]=m;
        }
        arr[arr.length-1]=-1;
        return arr;
    }
}