class Solution {
    public static int getDays(int weights[], int cap){
        int d,c;
        d=c=0;
        for(int w : weights){
            if(c+w <= cap){
                c+=w;
            }else{
                d++;
                c=w;
            }
        }
        if(c > 0) d++;
        return d;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low,high;
        low = high = -1;
        for(int w : weights){
            low = Math.max(low,w);
            high += w;
        }
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            int res = getDays(weights,mid);
            if(res <= days){
                ans = mid;
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}