package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxDepth {

    public int maxDepth(Node root) {
        if(root == null) return 0;
        int max = 0;
        for(Node child: root.children){
            int depth = maxDepth(child);
            max = Math.max(max, depth);
        }

        return max + 1;
    }

    public static void main(String args[]){
        /* creating a binary tree and entering
         the nodes */
        Node n1 = new Node(5,null);
        Node n2 = new Node(2,null);
        Node n3 = new Node(4,null);
        List<Node> list1 = new LinkedList<>();
        List<Node> list2 = new LinkedList<>();
        List<Node> list3 = new LinkedList<>();
        list1.add(n1);
        Node n4 = new Node(3, list1);
        list2.add(n4);
        list2.add(n2);
        list2.add(n3);
        Node n5 = new Node(1, list3);

        MaxDepth m = new MaxDepth();
        System.out.println(m.maxDepth(n5));


    }

}
