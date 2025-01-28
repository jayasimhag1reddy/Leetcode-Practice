class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int maxSum=nums[0];
        int minSum=nums[0];
        for(int i=1;i<nums.length;i++){
            maxSum=Math.max(nums[i],maxSum+nums[i]);
            minSum=Math.min(nums[i],minSum+nums[i]);
            max=Math.max(max,maxSum);
            min=Math.min(min,minSum);
        }
        return Math.max(max,Math.abs(min));
    }
}