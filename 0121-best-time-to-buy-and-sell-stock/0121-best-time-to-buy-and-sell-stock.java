class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minVal=Integer.MAX_VALUE;
        for(int price : prices){
            minVal=Math.min(minVal,price);
            maxProfit = Math.max(maxProfit,price - minVal);
        }
        return maxProfit;
    }
}