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
class PreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        //will use stack as an additional data structure
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if(root == null) {
            return output;
        }
        stack.add(root);
        while(!stack.isEmpty()) {
            TreeNode temp = stack.pollLast();
            output.add(temp.val);
            //We will add right subtree first because we are using LIFO and we need to poll left subtree first
            if(temp.right != null) {
                stack.add(temp.right);
            }
            if(temp.left != null) {
                stack.add(temp.left);
            }
        }
        return output;
        
    }
}