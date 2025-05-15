class Solution {
    static int[] findLH(int arr[]){
        int low=arr[0];
        int high=0;
        for(int el : arr){
            if(el > low){
                low=el;
            }
            high+=el;
        }
        return new int[]{low,high};
    }
    static int findDays(int arr[], int wt){
        int total=0,c=0;
        for(int w : arr){
            c+=w;
            if(c > wt){
                total++;
                c=w;
            }   
        }
        if(c > 0)total++;
        return total;
    }
    public int shipWithinDays(int[] weights, int days) {
        int res[] = findLH(weights);
        int low = res[0];
        int high = res[1];

        while(low <= high){
            int mid =(low+high)/2;
            int day = findDays(weights, mid);
            if(day <= days){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}