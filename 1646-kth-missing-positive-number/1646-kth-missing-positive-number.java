class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int maxi = arr[n-1] + k;
        int hash[] = new int[maxi +1];
        for(int ele : arr){
            hash[ele]++;
        }
        int c = 0;
        for(int i=1;i<=maxi;i++){
            if(hash[i] == 0) c++;
            if(c == k) return i;
        }
        return maxi;
    }
}