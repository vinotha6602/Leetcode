class Solution {
    public TreeNode pruneTree(TreeNode root) {
        if(root == null) return null;

        solve(root);
        if(root.val == 0 && root.left == null && root.right == null){
            return null;
        }else {
            return root;
        }
    }

    public boolean solve(TreeNode node){
        if(node == null) return false;

        boolean leftContains = solve(node.left);
        boolean rightContains = solve(node.right);

        if(!leftContains){
            node.left = null;
        }
        if(!rightContains){
            node.right = null;
        }

        return node.val == 1 || leftContains || rightContains;
    }
}