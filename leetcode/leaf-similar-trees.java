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
    
    public void check(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            list.add(root.val);
        }
        check(root.left,list);
        check(root.right,list);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> t1=new ArrayList<>();
        List<Integer> t2=new ArrayList<>();
        check(root1,t1);
        check(root2,t2);
        return t1.equals(t2);
    }
}