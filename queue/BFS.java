package queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    TreeNode root;

    public TreeNode insert(TreeNode node, int value){
        if(node == null){
            node = new TreeNode(value);
            return node;
        }
        if(node.val > value){
            node.left = insert(node.left, value);
        }
        if(node.val < value){
            node.right = insert(node.right, value);
        }
        return node;
    }

    public void insert(int val){
        root = insert(root, val);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer> level = new LinkedList<>();
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        if (root != null)
            queue1.add(root);
        while(!queue1.isEmpty()) {
            TreeNode node = queue1.remove();
            level.add(node.val);
            if (node.left != null)
                queue2.add(node.left);
            if (node.right != null)
                queue2.add(node.right);
            if (queue1.isEmpty()) {
                result.add(level);
                level = new LinkedList<>();
                queue1 = queue2;
                queue2 = new LinkedList<>();
            }
        }
        return result;
    }

    public void print(){
        List<List<Integer>> result = levelOrder(root);
        for(List<Integer> list: result){
            for(int val: list){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        BFS tree = new BFS();
        /*
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.print();
    }

}
