class Solution {
    public int minAddToMakeValid(String s) {
        int oCount = 0, cCount = 0;
        for (char i : s.toCharArray()) {
            if (i == '(') {
                oCount++;
            } else {
                if (oCount > 0) {
                    oCount--;
                } else {
                    cCount++;
                }
            }
        }
        return oCount + cCount;
    }
}