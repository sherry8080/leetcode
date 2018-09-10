package stack;

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

    public Node reverseList(Node head) {
        Stack stack = new Stack();
        Node node = head;
        while(node != null){
            stack.push(node);
            node = node.next;
        }
        while(stack != null){
            
        }
    }

    public static void main(String args[]){

        ReverseList rl = new ReverseList();


    }
}
