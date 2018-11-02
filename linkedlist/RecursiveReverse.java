package linkedlist;

public class RecursiveReverse {

    Node head;

    public class Node{
        int val;
        Node next;
        Node(int x){
            val = x;
        }
    }

    public void push(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void reverse(Node node){
        if(node != null){
            reverse(node.next);
            System.out.println(node.val + " ");
        }
    }

    public void reverse(){
        reverse(head);
    }

    public static void main(String args[]){

        RecursiveReverse r = new RecursiveReverse();

        r.push(1);
        r.push(2);
        r.push(3);

        r.reverse();

    }
}
