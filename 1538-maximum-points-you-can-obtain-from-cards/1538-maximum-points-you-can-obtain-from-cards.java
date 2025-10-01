class Solution {
    public int maxScore(int[] points, int k) {
        int left =0;
        int right =0;
        int maxi=0;
        int n= points.length;
        for(int i=0;i<k;i++){
            left += points[i];
        }
        maxi = left;
        for(int i=n-1,j=k-1;i>n-k;i--,j--){
            left -= points[j];
            right += points[i];
            maxi = Math.max(maxi, left+right);
        }
        maxi = Math.max(maxi, right + points[n-k]);
        return maxi;
    }
}