class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> al=new ArrayList<>();
        helper(0,nums,ans,al);
        return ans;
    }
    public void helper(int i,int[] nums,List<List<Integer>> ans,List<Integer> al){
        if(i>=nums.length){
            ans.add(new ArrayList<>(al));
            return;
        }
        al.add(nums[i]);
        helper(i+1,nums,ans,al);
        al.remove(al.size()-1);
        helper(i+1,nums,ans,al);
    }
}