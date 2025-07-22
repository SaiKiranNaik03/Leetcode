class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int left[] = new int[n];
        left[0] = 1;
        for(int i=1;i<n;i++){
            if(ratings[i] > ratings[i-1]) left[i] = left[i-1]+1;
            else left[i] = 1;
        }
        int right = 1;
        int total = 0;
        for(int i=n-1;i>=0;i--){
            if(i < n-1 && ratings[i] > ratings[i+1]) right++;
            else right = 1;

            total += Math.max(right,left[i]);
        }
        return total;
    }
}