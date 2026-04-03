class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int cap = arr[n-1] + k +1;
        int hash[] = new int[cap];
        for(int a : arr) hash[a]++;

        int c = 0;
        for(int i=1;i<cap;i++){
            if(hash[i] == 0) c++;
            if(c == k) return i;
        }
        return arr[n-1]+k;
    }
}