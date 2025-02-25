class Solution {
    public int numDecodings(String s) {
        int[]dp=new int[s.length()];
        Arrays.fill(dp,-1);
        return helper(0,s,dp);
    }
    public int helper(int i,String s,int[] dp){
        if(i>=s.length())return 1;
        if(s.charAt(i)=='0')return 0;
        if(dp[i]!=-1)return dp[i];
        int one=helper(i+1,s,dp);
        int two=0;
        if(i+2<=s.length() && Integer.parseInt(s.substring(i,i+2))<27){
            two=helper(i+2,s,dp);
        }
        return dp[i]=one+two;
    }

}
