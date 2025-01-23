class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        helper(0,0,n,"",ans);
        return ans;
    }
    public void helper(int open,int close,int n,String res,List<String> ans){
        if(close==n){
            ans.add(res);
            return;
        }
        if(open<n){
            helper(open+1,close,n,res+"(",ans);
        }
        if(close<open){
            helper(open,close+1,n,res+")",ans);
        }
    }
}