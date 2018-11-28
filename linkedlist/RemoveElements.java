package linkedlist;

import java.util.LinkedList;

public class RemoveElements {

    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while(curr != null) {
            if(curr.val == val){
                prev.next = curr.next;
            }else{
                prev = prev.next;
            }
            curr = curr.next;
        }

        return dummy.next;
    }

    public static void main(String [] args) {
        RemoveElements r = new RemoveElements();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        //ListNode node4 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        // node3.next = node4;

        ListNode curr = node1;

        curr = r.removeElements(node1, 1);

        while(curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }

    }


}
