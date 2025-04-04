class Solution {
    public int secondHighest(String s) {
        int len = s.length();
        int max = -1;
        int smax = -2;
        
        for(int i = 0; i<len; i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c))
            {
                int ch = c - '0';
                if(ch > smax && ch > max)
                {
                    smax = max;
                    max = ch;
                }   
                else if(ch > smax && ch < max)
                {
                    smax = ch;
                } 
            }
        }
        if(smax == -2) return -1;
        return smax;
    }
}
