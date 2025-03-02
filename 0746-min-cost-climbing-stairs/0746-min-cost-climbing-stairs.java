class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp1=new int[cost.length];
        int[] dp2=new int[cost.length];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.min(helper(0,cost,dp1),helper(1,cost,dp2));
    }
    public int helper(int i,int[] cost,int[] dp){
        if(i>=cost.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int one=cost[i]+helper(i+1,cost,dp);
        int two=cost[i]+helper(i+2,cost,dp);
        return dp[i]=Math.min(one,two);
    }
}