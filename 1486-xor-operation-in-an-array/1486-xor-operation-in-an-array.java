class Solution {
    public int xorOperation(int n, int start) {
        int xor=0;
        for(int j=0,i=start;j<n;i+=2,j++){
            xor ^= i;
        }
        return xor;
    }
}