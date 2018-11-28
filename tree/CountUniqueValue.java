package tree;

public class CountUniqueValue {

    public int countUnivalSubtrees(TreeNode root) {
        int[] count = new int[1];
        helper(root, count);
        return count[0];

        /*int count = 0;
        helper(root, count);
        return count;*/
    }

    private boolean helper(TreeNode node, int[] count) {
        if (node == null) {
            return true;
        }
        boolean left = helper(node.left, count);
        boolean right = helper(node.right, count);
        if (left && right) {
            if (node.left != null && node.val != node.left.val) {
                return false;
            }
            if (node.right != null && node.val != node.right.val) {
                return false;
            }
            count[0]++;
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        /* creating a binary tree and entering
         the nodes */
        TreeNode tree_level = new TreeNode(2);
        tree_level.left = new TreeNode(3);
        tree_level.right = new TreeNode(1);
        tree_level.left.left = new TreeNode(4);
        tree_level.left.right = new TreeNode(4);

        CountUniqueValue c = new CountUniqueValue();
        System.out.println(c.countUnivalSubtrees(tree_level));

    }
}
