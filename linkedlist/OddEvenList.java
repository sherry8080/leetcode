package linkedlist;

public class OddEvenList {
    public ListNode oddEvenList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode curr = even;

        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = curr;

        return head;
    }

    public static void main(String args[]){

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(3);
        int[] g = {3,4,0,2,1};

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode curr = node1;

        OddEvenList o = new OddEvenList();

        curr = o.oddEvenList(node1);

        while(curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }

    }
}
