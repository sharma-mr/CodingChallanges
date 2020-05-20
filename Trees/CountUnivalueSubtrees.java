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
class CountUnivalueSubtrees {
    
    int count = 0;
    
    public int countUnivalSubtrees(TreeNode root) {
        if (root ==null) {
            return 0;
        }
            isUnival(root);
            return count;   
        }
    
    private boolean isUnival(TreeNode root) {
        boolean result = true;
        //base case of leaf node
        if(root.left == null && root.right == null) {
            count++;
            return true;
        }
        
        //if left not null
        if(root.left != null) {
            result =  isUnival(root.left) && result && root.left.val == root.val;
        }
        if(root.right !=null) {
            result =  isUnival(root.right) && result && root.right.val == root.val;
        }
        if(!result) return false;
        count++;
        return true; 
    }
}