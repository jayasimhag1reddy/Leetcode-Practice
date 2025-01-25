class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp=new int[coins.length+1][amount+1];
        for(int[] ar:dp){
            Arrays.fill(ar,-1);
        }
        if(helper(0,coins,amount,dp)>=100000)return -1;
        return helper(0,coins,amount,dp);
    }
    public int helper(int i,int[] coins,int amt,int[][] dp){
        if(i==coins.length-1){
            if(amt%coins[i]==0){
                return amt/coins[i];
            }
            else{
                return 100001;
            }
        }
        if(dp[i][amt]!=-1)return dp[i][amt];
        int np=helper(i+1,coins,amt,dp);
        int p=100001;
        if(coins[i]<=amt){
            p=1+helper(i,coins,amt-coins[i],dp);
        }
        return dp[i][amt]=Math.min(p,np);
    }
}