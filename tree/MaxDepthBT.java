package tree;

public class MaxDepthBT {

    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        int ans = Math.max(left, right) + 1;
        return ans;
    }

    public static void main(String args[]){
        /* creating a binary tree and entering
         the nodes */
        TreeNode tree_level = new TreeNode(2);
        tree_level.left = new TreeNode(3);
        tree_level.right = new TreeNode(1);
        tree_level.left.left = new TreeNode(4);
        tree_level.left.right = new TreeNode(5);

        MaxDepthBT md = new MaxDepthBT();
        System.out.println(md.maxDepth(tree_level));

    }
}
