package stack;

import java.util.Stack;

public class LinkedListPalindrome {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;

        while(curr != null){
            stack.push(curr);
            curr = curr.next;
        }

        while(head != null){
            if(stack.pop().val != head.val){
                return false;
            }
        }
        return true;
    }
}
