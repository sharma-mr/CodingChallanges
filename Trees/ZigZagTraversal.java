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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null) {
            return result;
        }
        boolean zigzag = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
         List<Integer> level = new ArrayList();
         int size = queue.size();
         for(int i = 0; i < size; i++) {
             
             TreeNode temp = queue.poll();
             if(zigzag) {
                 level.add(0, temp.val);
             } else {
                 
                 level.add(temp.val);
             }
             
            if(temp.left != null) {
                queue.offer(temp.left);
            }
             
             if(temp.right != null) {
                 
                 queue.offer(temp.right);
             }
         }
            
            result.add(level);
            zigzag = !zigzag;
            
        }
        
        return result;
    }
}