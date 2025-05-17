class Solution {
    static int lowerB(int arr[]){
        Arrays.sort(arr);
        int low=0;
        int high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == 1){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return arr.length - low;
    }
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n =mat.length;
        int m = mat[0].length;
        int res[] = new int[2];
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int ones = lowerB(mat[i]);
            if(ones > maxi){
                maxi = ones;
                res[0]=i;
                res[1]=maxi;
            }
        }
        return res;
    }
}