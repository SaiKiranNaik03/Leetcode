class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length; int m = mat[0].length;
        int low = 0, high = m - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int ind = maxCol(mat, mid);
            int left = mid - 1 == -1 ? -1 : mat[ind][mid - 1];
            int right = mid + 1 == m ? -1 : mat[ind][mid + 1];
            if (left < mat[ind][mid] && right < mat[ind][mid]) {
                return new int[]{ind, mid};
            }
            else if (left > mat[ind][mid]) high = mid - 1;
            else low = mid + 1;
        } 
        return new int[]{-1, -1};
    }
    public int maxCol(int[][] mat, int col) {
        int max = Integer.MIN_VALUE;
        int ind = -1;
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][col] > max) {
                max = mat[i][col]; ind = i;
            }
        }
        return ind;
    }
}