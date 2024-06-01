class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int maxPoints=0;
        int left=0,right=0;
        for(int i=0;i<k;i++){
            left+=cardPoints[i];
        }
        maxPoints=left;
        for(int i=n-1,j=k-1;i>n-k;i--,j--){
            int points=0;
            left-=cardPoints[j];
            right+=cardPoints[i];
            points=left+right;
            if(points > maxPoints){
                maxPoints=points;
            }
        }
        right+=cardPoints[n-k];
        // right=0;
        // for(int i=n-k;i<n;i++){
        //     right+=cardPoints[i];
        // }
        if(right > maxPoints){
            maxPoints=right;
        }
        return maxPoints;
    }
}