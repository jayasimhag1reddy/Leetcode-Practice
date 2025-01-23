class Solution {
    public boolean canJump(int[] nums) {
        int j=nums.length-1;
        int i=nums.length-2;
        while(i>=0){
            if(nums[i]>=j-i){
                j=i;
            }
            i--;
        }
        return j==0;
    }
}