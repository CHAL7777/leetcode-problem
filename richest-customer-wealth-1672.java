class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealthSofar=0;
        for(int[] customer:accounts){
             int currentCustomerWealth=0;
            for(int bank :customer){
               currentCustomerWealth+=bank;
            }
            maxWealthSofar=Math.max(maxWealthSofar,currentCustomerWealth);
        }
        return maxWealthSofar;
    }
}