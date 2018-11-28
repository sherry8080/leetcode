package tree;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return symmertic(root, root);
    }

    public boolean symmertic(TreeNode t1, TreeNode t2){
        if (t1 == null && t2 == null) {
            return true;
        }
        if(t1 == null || t2 == null){
            return false;
        }
        return (t1.val == t2.val) && symmertic(t1.right, t2.left) && symmertic(t1.left, t2.right);
    }
}
