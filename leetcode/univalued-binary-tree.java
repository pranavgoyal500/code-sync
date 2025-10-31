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
    public boolean check(TreeNode root,int c){
        if(root==null){
            return true;
        }
        if(root.val!=c){
            return false;
        }
        return check(root.left,c)&&check(root.right,c);
    }
    public boolean isUnivalTree(TreeNode root) {
        return check(root,root.val);
    }
}