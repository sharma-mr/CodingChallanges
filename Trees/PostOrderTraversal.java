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
class PostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> values = new ArrayList<>();
        if(root == null) {
            return values;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            values.add(0, temp.val);
            if(temp.left != null) {
                stack.push(temp.left);
            }
            if(temp.right != null) {
                stack.push(temp.right);
            }
            
        }
    return values;
    }
}