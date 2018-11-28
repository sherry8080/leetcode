package tree;

import java.util.LinkedList;
import java.util.Queue;

public class LeftBottom {

    public void findBottomLeftValue(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()){

            /* poll() removes the present head.
            For more information on poll() visit
            http://www.tutorialspoint.com/java/util/linkedlist_poll.htm */
            TreeNode tempNode = queue.poll();
            System.out.print(tempNode.val + " ");

            if(tempNode.left != null || tempNode.right != null){
                level++;
            }

            /*Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }

        while (!queue.isEmpty() && level > 0){

            TreeNode tempNode = queue.poll();

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /*Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }

            level--;

        }
    }

    public static void main(String args[])
    {
        /* creating a binary tree and entering
         the nodes */
        TreeNode tree_level = new TreeNode(2);
        tree_level.left = new TreeNode(3);
        tree_level.right = new TreeNode(1);
        tree_level.left.left = new TreeNode(4);
        tree_level.left.right = new TreeNode(5);

        System.out.println("Level order traversal of binary tree is - ");
        LeftBottom lb = new LeftBottom();
        lb.findBottomLeftValue(tree_level);
    }
}
