class Solution {
    public boolean binarySearch(int arr[],int key){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==key){
                return true;
            }
            else if(arr[mid] < key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        boolean res=false;
        for(int i=0;i<n;i++){
            if(matrix[i][0] <= target && target <= matrix[i][m-1]){
                res = binarySearch(matrix[i],target);
            }
        }
        return res;
    }
}