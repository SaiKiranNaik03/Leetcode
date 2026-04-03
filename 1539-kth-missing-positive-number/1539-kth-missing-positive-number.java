class Solution {
    public int findKthPositive(int[] arr, int k) {
        for(int n : arr){
            if(n <= k) k++;
            else break;
        }
        return k;
    }
}