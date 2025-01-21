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
    public int goodNodes(TreeNode root) {
        int[] ans=new int[1];
        helper(root,Integer.MIN_VALUE,ans);
        return ans[0];
    }
    public void helper(TreeNode root,int max,int[] ans){
        if(root==null)return;
        if(root.val>=max){
            ans[0]++;
            helper(root.left,root.val,ans);
            helper(root.right,root.val,ans);
        }
        else{
            helper(root.left,max,ans);
            helper(root.right,max,ans);
        }
    }
}