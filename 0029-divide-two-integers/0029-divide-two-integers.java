import java.util.*;
class Solution {
    /*public int divide(int dividend, int divisor) {
        // if (dividend == Integer.MIN_VALUE && divisor == -1){
        //     return Integer.MAX_VALUE;
        // }
        if(divisor==1) return dividend;
        if(dividend == divisor) return 1;
        boolean sign = true;
        if(dividend >=0 && divisor < 0) sign=false;
        if(dividend <= 0 && divisor > 0) sign=false;
        
        long num=Math.abs(dividend);
        long d=Math.abs(divisor);
        int ans=0;
        while(num >= d){
            int count=0;
            while( num >= (d << (count+1))){
                count++;
            }
            ans += (1<<count);
            num = num - (d*(1 << count));
        }
        
        if( ans == (1 << 31) & sign==true){
            return Integer.MAX_VALUE;
        }
        else if(ans == (1 << 31) & sign==false){
            return Integer.MIN_VALUE;
        }
        
        if(sign == false){
            return -1*ans;
        }
        return ans;
    
    }*/
    
    public int divide(int dividend, int divisor) {
        int ans=dividend/divisor;
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        return ans;

    }
}