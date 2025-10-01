class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c1,c2,c3;
        c1=c2=c3=0;
        for(int c : bills){
            if(c==5){
                c1++;
            }else if(c == 10){
                if(c1 > 0){
                    c1--;
                    c2++;
                }else{
                    return false;
                }
            }else{
                if(c1 > 0 && c2 > 0){
                    c1--;
                    c2--;
                    c3++;
                }else if(c1 >= 3){
                    c1 -= 3;
                    c3++;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}