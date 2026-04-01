class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        List<Integer> res = new ArrayList<>();
        int top,left,right,bottom;
        top=left=0;
        right = c-1;
        bottom = r-1;

        while(top <= bottom && left <= right){
            for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                res.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    res.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if(left <= right){
                for(int i=bottom;i>=top;i--){
                    res.add(matrix[i][left]);
                }
            }
            left++;
        }
        return res;
    }
}