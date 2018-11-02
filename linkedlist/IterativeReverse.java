package linkedlist;

public class IterativeReverse {

    Node head;

    public class Node{
        int val;
        Node next;
        Node(int x){val = x;}
    }

    public void insertHead(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

    }

    public Node reverse(Node head){
        Node prev = null;
        Node next = null;
        Node curr = head;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public void reverse(){
        head = reverse(head);
    }

    public void print(){
        Node node = head;
        while(node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static void main(String args[]){

        IterativeReverse r = new IterativeReverse();

        r.insertHead(1);
        r.insertHead(2);
        r.insertHead(3);

        r.reverse();

        r.print();
    }
}
