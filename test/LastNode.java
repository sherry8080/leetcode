package test;

public class LastNode {

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

    public int countNode() {
        Node temp = head;
        int count = 0;
        while(temp.next != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public int getLastNode(int index) {
        Node temp = head;
        int i = 0;
        int len = countNode();
        while(i < len - index + 1) {
            temp = temp.next;
            i++;
        }
        return temp.getData();
    }

    public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public int solution(int index) {
        Node first = head;
        Node second = head;
        if(index < 0 || head == null) return -1;
        int i = 0;
        while(first.next != null) {
            first = first.next;
            if(i == index - 1) {
                second = second.next;
            }else if(i < index - 1){
                i++;
            }
        }
        return second.getData();
    }

    public static void main(String [] args) {
        LastNode node = new LastNode();
        node.push(10);
        node.push(20);
        node.push(4);
        node.push(15);
        node.push(35);
        node.push(9);
        node.push(26);

        System.out.println(node.getLastNode(3));
        System.out.println(node.solution(3));
    }
}
