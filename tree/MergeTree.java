package tree;

public class MergeTree {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

        return t1;
    }

    public static void main(String args[]){
        MergeTree tree = new MergeTree();
        TreeNode t1 = new TreeNode(2);
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(4);
        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        tree.mergeTrees(t1, t2);
    }
}
