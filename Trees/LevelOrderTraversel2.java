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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        LinkedList<List<Integer>> levelOrder = new LinkedList<>();
        
        if(root == null) {
            
            return levelOrder;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                
                TreeNode temp = queue.remove();
                level.add(temp.val);
                if(temp.left != null) {
                    
                    queue.add(temp.left);
                }
                
                if(temp.right != null) {
                    
                    queue.add(temp.right);
                }
                
            }
            
            levelOrder.addFirst(level);
        }
        
        return levelOrder;
    }
}