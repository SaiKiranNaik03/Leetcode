class Solution {
    int getB(int arr[], int day, int k){
        int total=0;
        int cnt=0;
        for(int flo : arr){
            if(flo <= day){
                cnt++;
            }else{
                total += cnt/k;
                cnt=0;
            }
        }
        total += cnt/k;
        return total;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k > bloomDay.length) return -1;
        int low = 1;
        int high = 0;
        for(int b : bloomDay) high = Math.max(high,b);
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int flo = getB(bloomDay, mid, k);
            if (flo >= m) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}