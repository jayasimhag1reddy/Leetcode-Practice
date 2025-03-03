class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int left=1;
        ans[0]=1;
        for(int i=1;i<nums.length;i++){
            left*=nums[i-1];
            ans[i]=left;
        }
        int right=1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i]*=right;
            right*=nums[i];
        }
        return ans;
    }
}