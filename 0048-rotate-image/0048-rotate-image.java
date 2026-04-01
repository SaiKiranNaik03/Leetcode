class Solution {

    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        int res[][] = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                res[j][r-i-1] = matrix[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j] = res[i][j];
            }
        }
        return ;
    }
}