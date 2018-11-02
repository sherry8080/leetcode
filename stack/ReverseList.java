package stack;

import java.util.LinkedList;
import java.util.Stack;

public class ReverseList {

    Node head;

    public class Node {
        int val;
        Node next;
        Node(int x) { val = x; }
    }

    public void push(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void reverseList() {
        Stack<Node> stack = new Stack<Node>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop().val + " ");
        }
    }


    public void print(){
        Node node = head;
        while(node != null){
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String args[]){

        ReverseList rl = new ReverseList();

        rl.push(1);
        rl.push(2);
        rl.push(3);

        rl.print();
        System.out.println();
        System.out.println("after");
        rl.reverseList();

    }
}
