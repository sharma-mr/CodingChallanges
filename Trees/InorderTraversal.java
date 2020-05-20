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
 *https://leetcode.com/problems/binary-tree-inorder-traversal/
 *Time complexity : O(n)
 *Space complexity : O(n)
 */
class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> lst = new ArrayList<>();
        TreeNode temp = root;
        while(!stack.isEmpty() || temp !=null) {
            if(temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                lst.add(temp.val);
                temp = temp.right;
            }
        }
        return lst;
        
    }
}