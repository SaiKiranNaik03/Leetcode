class Solution {
    public int Histogram84(int[] num) {
        Stack<Integer> stk = new Stack<>();
        int maxArea = 0;
        stk.push(-1);
        for(int i=0;i<num.length;i++){
            while(stk.peek() != -1 && num[stk.peek()] >= num[i]){
                int height = num[stk.pop()];
                int width = i - stk.peek() -1;
                maxArea = Math.max(maxArea, height*width);
            }
            stk.push(i);
        }

        while(stk.peek() != -1){
            int height = num[stk.pop()];
            int width = num.length -stk.peek() -1;
            maxArea = Math.max(maxArea,height*width);
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int prefix[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == '1'){
                    prefix[i][j] = (i > 0 ? prefix[i - 1][j] : 0) + 1;
                }
                else{
                    prefix[i][j] = 0;
                }
            }
        }
        int maxAns=0;
        for(int i=0;i<m;i++){
            maxAns = Math.max(maxAns,Histogram84(prefix[i]));
        }
        return maxAns;
    }
}