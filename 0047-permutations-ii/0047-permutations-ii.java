class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer> al=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        boolean[] vis=new boolean[nums.length];
        helper(nums,al,ans,vis);
        return ans;
    }
    public void helper(int[] nums,List<Integer> al,List<List<Integer>> ans,boolean[] vis){
        if(al.size()==nums.length){
            ans.add(new ArrayList<>(al));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(vis[i] || (i>0 && !vis[i-1] && nums[i]==nums[i-1]))continue;
            al.add(nums[i]);
            vis[i]=true;
            helper(nums,al,ans,vis);
            vis[i]=false;
            al.remove(al.size()-1);
        }
    }
}