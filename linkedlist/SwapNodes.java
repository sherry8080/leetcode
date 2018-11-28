package linkedlist;

public class SwapNodes  {

    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while(prev.next != null && prev.next.next != null){
            ListNode first = prev.next;
            ListNode second = prev.next.next;
            first.next = second.next;
            prev.next = second;
            second.next = first;
            prev = first;
        }

        return dummy.next;
    }

    public static void main(String args[]){

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

       SwapNodes s = new SwapNodes();

        ListNode curr = s.swapPairs(node1);

        while(curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }

    }
}
