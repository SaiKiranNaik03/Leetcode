class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int i = 0, j = 0, count = 0;
        int[] alpha = new int[3];

        while (j < n) {
            alpha[s.charAt(j) - 'a']++;

            while (alpha[0] > 0 && alpha[1] > 0 && alpha[2] > 0) {
                count += (n - j);
                alpha[s.charAt(i) - 'a']--;
                i++;
            }
            j++;
        }
        return count;
    }

}