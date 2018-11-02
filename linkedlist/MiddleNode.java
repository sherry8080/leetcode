package linkedlist;

public class MiddleNode {

    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }

        public int getData() {
            return data;
        }
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public Node middleNode() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String [] args) {
        MiddleNode node = new MiddleNode();
        node.push(20);
        node.push(4);
        //node.push(10);
        node.push(15);
        node.push(35);

        System.out.println(node.middleNode().getData());
    }

}
