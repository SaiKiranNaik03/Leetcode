class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;

        int max = arr[n-1] + k;
        int hash[] = new int[max+1];

        for(int ele : arr){
            hash[ele]++;
        }
        int c = 0;
        for(int i=1;i<max+1;i++){
            if(hash[i] == 0) c++;
            if(c == k) return i;
        }
        return -1;
    }
}