class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int left,right;
        left = 0;
        right = 0;
        for(int i=0;i<k;i++) left += cardPoints[i];
        int maxi = left;
        for(int i=n-1,j=k-1;i>=n-k;i--,j--){
            left -= cardPoints[j];
            right += cardPoints[i];
            maxi = Math.max(maxi,left+right);
        }
        return maxi;
    }
}