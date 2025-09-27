class Solution {
    public int maxProfit(int[] prices) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int ele : prices){
            mini = Math.min(mini, ele);
            maxi = Math.max(maxi, ele - mini);
        }
        return maxi;
    }
}