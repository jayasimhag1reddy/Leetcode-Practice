class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre=new int[nums.length];
        int[] pos=new int[nums.length];
        pre[0]=1;
        pos[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            pre[i]=nums[i-1]*pre[i-1];
            pos[nums.length-i-1]=nums[nums.length-i]*pos[nums.length-i];
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=pre[i]*pos[i];
        }
        return ans;
    }
}
