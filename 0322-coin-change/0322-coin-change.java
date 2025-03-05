class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[coins.length][amount+1];
        for(int[] ar:dp)Arrays.fill(ar,-1);
        if(helper(coins,0,amount,dp)>=100001) return -1;
        return helper(coins,0,amount,dp);
    }
    public int helper(int[] coins,int i,int amount,int[][] dp){
        if(i==coins.length-1){
            if(amount%coins[i]==0){
                return amount/coins[i];
            }
            else{
                return 100001;
            }
        }
        if(dp[i][amount]!=-1)return dp[i][amount];
        int p=Integer.MAX_VALUE;
        if(coins[i]<=amount){
            p=1+helper(coins,i,amount-coins[i],dp);
        }
        int np=helper(coins,i+1,amount,dp);
        return dp[i][amount]=Math.min(np,p);
    }
}