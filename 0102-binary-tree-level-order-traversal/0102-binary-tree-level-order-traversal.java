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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int si=q.size();
            List<Integer> al=new ArrayList<>();
            while(si>0){
                TreeNode tmp=q.poll();
                al.add(tmp.val);
                if(tmp.left!=null){
                    q.add(tmp.left);
                }
                if(tmp.right!=null){
                    q.add(tmp.right);
                }
                si--;
            }
            ans.add(al);
        }
        return ans;
    }
}