package Easy;

public class LC0141_Linked_List_Cycle {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode fast = new ListNode(0);
        
        if (head == null || head.next == null) {
            return false;
        }
        fast.val = head.val;
        fast.next = head.next;
        head.val = head.next.val;
        head.next = head.next.next;
        fast.val = fast.next.val;
        fast.next = fast.next.next;
        if (fast.next == null) {
            return false;
        }
        fast.val = fast.next.val;
        fast.next = fast.next.next;
        while (fast.next != null && fast.next.next != null) {
            if ( head.val ==  fast.val) {
                return true;
            }
            head.val = head.next.val;
            head.next = head.next.next;
            fast.val = fast.next.val;
            fast.next = fast.next.next;
            if (fast.next == null) {
                return false;
            }
            fast.val = fast.next.val;
            fast.next = fast.next.next;
        }
        return false;
    }
}
