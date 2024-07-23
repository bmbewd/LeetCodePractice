package Easy;

public class LC0083_Remove_Duplicates_From_Sorted_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        if (head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
                deleteDuplicates(head);
            } else {
                deleteDuplicates(head.next);
            }
        }
        return head;
    }
}
