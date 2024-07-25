package Easy;

public class LC0206_Reverse_Linked_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode reverse = new ListNode(head.val, null);
        while (head.next != null) {
            ListNode tmp = new ListNode(head.next.val, reverse);
            reverse = tmp;
            head.next = head.next.next;
        }
        return reverse;
    }
}
