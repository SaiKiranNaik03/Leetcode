class Solution {
    public int largestRectangleArea(int[] num) {
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
}