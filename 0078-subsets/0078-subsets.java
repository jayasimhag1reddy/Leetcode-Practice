class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(nums,0,ans,new ArrayList<>());
        return ans;
    }
    public void helper(int[] nums,int i,List<List<Integer>> ans,List<Integer> temp){
        ans.add(new ArrayList<>(temp));
        for(int j=i;j<nums.length;j++){
            temp.add(nums[j]);
            helper(nums,j+1,ans,temp);
            temp.remove(temp.size()-1);
        }
    }
    
}