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
    public boolean isValidBST(TreeNode root) {
        
        if(root == null){
            return true;
        }
        
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
        
    }
    
    boolean valid(TreeNode root, long start, long end){
        
        if(root == null){
            return true;
        }
        
        if(start < root.val && end > root.val){
            return valid(root.left, start, root.val) && valid(root.right, root.val, end);
        }
        
        return false;
        
    }
    
}