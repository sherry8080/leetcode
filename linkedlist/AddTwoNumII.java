package linkedlist;

public class AddTwoNumII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = null;
        ListNode curr = l1;
        while(curr != null){
            ListNode node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = node;
        }
        l1 = prev;

        prev = null;
        curr = l2;
        while(curr != null){
            ListNode node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = node;
        }
        l2 = prev;

        int carry = 0;
        ListNode ans = new ListNode(0);
        curr = ans;
        int sum = 0;
        int x = 0;
        int y = 0;

        while(l1 != null || l2 != null){
            if(l1 != null) {
                x = l1.val;
            }else{
                x = 0;
            }
            if(l2 != null){
                y = l2.val;
            }else{
                y = 0;
            }

            sum = x + y + carry;
            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(carry > 0){
            curr.next = new ListNode(1);
        }
        return ans;
    }
}
