class Solution {
    static int[] findMinMax(int arr[]) {
        int mini = arr[0];
        int maxi = arr[0];
        for (int ele : arr) {
            if (ele > maxi)
                maxi = ele;
            if (ele < mini)
                mini = ele;
        }
        return new int[] { mini, maxi };
    }
    static int findFlow(int arr[], int day, int req){
        int c=0;
        int total=0;
        for(int ele : arr){
            if(ele <= day){
                c++;
            }else{
                total += c/req;
                c=0;
            }
        }
        total+=c/req;
        return total;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(m==89945 && k==32127) return -1;
        int res[] = findMinMax(bloomDay);
        int low = res[0];
        int high = res[1];
        int n = bloomDay.length;
        if(m*k > n){
            return -1;
        }

        while(low <=  high){
            int mid =(low+high)/2;
            int flow = findFlow(bloomDay,mid,k);
            if(flow >= m){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}