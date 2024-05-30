class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int n : nums){
            xor ^= n;
        }
        int rightmost=(xor & xor-1) ^ xor;
        int b1=0,b2=0;
        for(int n : nums){
            if((rightmost & n) == 0){
                b2=b2 ^ n;
            }
            else{
                b1=b1^n;
            }
        }
        int res[]=new int[2];
        res[0]=b1;
        res[1]=b2;
        return res;   
    }
}