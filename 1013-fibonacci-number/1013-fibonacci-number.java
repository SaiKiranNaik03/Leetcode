class Solution {
    // Tabulation - optimal
    public int fib(int n) {
        if(n == 0) return 0;
        int a = 0;
        int b = 1;
        int c = a + b;
        for(int i=2;i<=n;i++){
            c = a + b;
            a=b;
            b=c;
        }
        return c;
    }
}