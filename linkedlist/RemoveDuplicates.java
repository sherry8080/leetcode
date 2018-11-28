package linkedlist;

import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicates {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = prev.next;

        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                prev.next = curr.next;
            }else{
                prev = prev.next;
            }
            curr = curr.next;
        }

        return dummy.next;
    }

    public static void main(String args[]){

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode curr = node1;

        RemoveDuplicates r = new RemoveDuplicates();

        curr = r.deleteDuplicates(curr);

        while(curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }

    }
}
