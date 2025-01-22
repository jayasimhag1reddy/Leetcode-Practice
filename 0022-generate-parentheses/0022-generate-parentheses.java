class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        helper(0,0,n,ans,"");
        return ans;
    }
    public void helper(int open,int close,int n,List<String> ans,String st){
        if(close==n){
            ans.add(st);
            return;
        }
        if(open<n){
            helper(open+1,close,n,ans,st+"(");
        }
        if(close<open){
            helper(open,close+1,n,ans,st+")");
        }
    }
}

//   (
// () ((
// ()( (() (((
// ()() ()((    