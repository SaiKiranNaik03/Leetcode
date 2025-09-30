class Solution {
    int findD(int arr[], int cap){
        int days = 0;
        int c = 0;
        for(int w : arr){
            if(c+w <= cap){
                c+=w;
            }else{
                days++;
                c=w;
            }
        }
        if(c > 0) days++;
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int w : weights){
             high += w;
             low = Math.max(low,w);
        }

        while(low <= high){
            int mid = (low + high)/2;
            int d = findD(weights, mid);
            if(d <= days){
                high = mid  - 1;
            }else{
                low = mid +1;
            }
        }
        return low;
    }
}