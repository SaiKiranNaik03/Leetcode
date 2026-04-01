class Solution {
    public int maxProfit(int[] prices) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for(int p : prices){
            mini = Math.min(mini,p);
            maxi = Math.max(maxi,p-mini);
        }
        return maxi;
    }
}