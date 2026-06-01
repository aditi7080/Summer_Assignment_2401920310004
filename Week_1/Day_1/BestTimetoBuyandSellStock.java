class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int max=0;

        for(int p=0;p<prices.length;p++){
            if(prices[p]<min){
                min=prices[p];
            }
            int profit=prices[p]-min;

            if(profit>max){
                max=profit;
            }
        }
        return max;
    }
}