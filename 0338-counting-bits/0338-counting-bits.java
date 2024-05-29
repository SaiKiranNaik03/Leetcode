class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        result[0] = 0;        
        int goBack = 0;
        for (int i = 1; i <= n; i++){
            if ((i&i-1) == 0) { // case of shifting to single 1 bit
                result[i] = 1;
                goBack = i;
            } else {
                result[i] = result[i - goBack] +1;
            }
        }

        return result;
    }
}