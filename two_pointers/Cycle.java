package two_pointers;


class ListNode{
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Cycle {


    public boolean hasCycle(ListNode head) {

        if(head == null || head.next == null) return false;

        ListNode first = head;
        ListNode second = head.next;

        //ListNode first = head.next;
        //ListNode second = head.next.next;

        while(first != second){
            if(first == null || second == null){
                return false;
            }
            first = first.next;
            second = second.next.next;
        }

        return true;
    }

    public static void main(String arg[]){

        Cycle c = new Cycle();
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(2);
        n1.next.next = new ListNode(3);
        if(c.hasCycle(n1)){
            System.out.println("has cycle");
        } else {
            System.out.println("no cycle");
        }
    }
}
