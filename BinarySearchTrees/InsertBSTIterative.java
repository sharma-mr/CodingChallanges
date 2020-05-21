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
    class InsertBSTIterative {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            
            TreeNode node = root;
            while(node != null) {
                
                if(val > node.val) {
                    //insert at the end
                    if(node.right == null) {
                        
                        node.right = new TreeNode(val);
                        return root;
                    }
                    
                    else node = node.right;
                }
                
                //insert into left subtree
                else  {
                    
                    if(node.left == null) {
                        
                        node.left = new TreeNode(val);
                        return root;
                    } else {
                        node = node.left;
                    }
                    
                }
                
            }
            return new TreeNode(val);
            
        }
    }