class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,ans,new ArrayList<>());
        return ans;
    }
    public void helper(int[] nums,int i, List<List<Integer>> ans,List<Integer> temp){
        ans.add(new ArrayList<>(temp));
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1])continue;
            temp.add(nums[j]);
            helper(nums,j+1,ans,temp);
            temp.remove(temp.size()-1);
        }
    }
}