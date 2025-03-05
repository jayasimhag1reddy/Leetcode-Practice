/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        if(root==null)return ans;
        q.add(root);
        while(!q.isEmpty()){
            int si=q.size();
            boolean flag=false;
            while(si>0){
                TreeNode tmp=q.poll();
                if(flag==false){
                    ans.add(tmp.val);
                    flag=true;
                }
                if(tmp.right!=null){
                    q.add(tmp.right);
                }
                if(tmp.left!=null){
                    q.add(tmp.left);
                }
                si--;
            }
        }
        return ans;
    }
}