class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        int leftMax = height[0];
        int totalWater = 0;
        for(int i=0;i<n;i++){
            leftMax = Math.max(leftMax,height[i]);
            totalWater += (Math.min(leftMax,rightMax[i]) - height[i]);
        }
        return totalWater;
    }
}