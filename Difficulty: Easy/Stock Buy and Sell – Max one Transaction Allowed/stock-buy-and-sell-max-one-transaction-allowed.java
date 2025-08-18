// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int buy=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            if(prices[i]-buy>max){
                max=prices[i]-buy;
            }
        }
        return max;
    }
}