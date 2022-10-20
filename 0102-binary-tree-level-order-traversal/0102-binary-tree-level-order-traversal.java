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
        
        List<List<Integer>> res = new ArrayList<>();
        
        if(root == null)
            return res;
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        
        while(! q.isEmpty()) {
            
            // List to carry the nodes of one level.
            List<Integer> list = new ArrayList<>();
            
            int levelSize = q.size();
            
            // Loop in the current level nodes.
            for(int i=0; i<levelSize; i++) {
                
                // Get the first node in our q and add it's value to list.
                TreeNode node = q.poll();
                list.add(node.val);
                
                // If the left child of the current node isn't null add it to q and the same thing for the right child.
                if(node.left != null) 
                    q.add(node.left);
                
                if(node.right != null) 
                    q.add(node.right);
            }
            
            res.add(list);
        }
        
        return res;
        
    }
}