class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s=1;
        int e=Integer.MIN_VALUE;
        for(int i:piles){
            e=Math.max(e,i);
        }
        while(s<e){
            int m=s+((e-s)/2);
            if(helper(piles,m)>h){
                s=m+1;
            }
            else{
                e=m;
            }
        }
        return e;
    }
    public int helper(int[] nums,int m){
        int ans=0;
        for(int i:nums){
            ans+=i/m;
            if(i%m!=0){
                ans++;
            }
        }
        return ans;
    }
}