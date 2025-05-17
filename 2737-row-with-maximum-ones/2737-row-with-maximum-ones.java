class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = 0;
        int[] sol = new int[2];
        for (int i = 0; i < mat.length; i++) {
            int c = 0;
            for (int j : mat[i]) {
                c += j;
            }
            if (c > max) {
                sol[0] = i;
                sol[1] = c;
                max = c;
            }
        }
        return sol;
    }
}