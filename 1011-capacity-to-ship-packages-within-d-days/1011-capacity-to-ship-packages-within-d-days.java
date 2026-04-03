class Solution {
    int[] getLH(int nums[]){
        int low = -1;
        int high = -1;
        for(int n : nums){
            low = Math.max(low,n);
            high +=n;
        }
        return new int[]{low,high};
    }
    int getD(int weights[], int cap){
        int total = 0;
        int c = 0;
        for(int w : weights){
            if(c + w <= cap){
                c+=w;
            }else{
                total++;
                c=w;
            }
        }
        if(c > 0) total++;
        return total;
    }
    public int shipWithinDays(int[] weights, int days) {
        int lh[] = getLH(weights);
        int low = lh[0];
        int high = lh[1];

        while(low <= high){
            int mid = (low+high)/2;
            int res = getD(weights,mid);
            if(res > days){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
}