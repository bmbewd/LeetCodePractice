package Easy;

import java.util.ArrayList;
import java.util.List;

public class LC0203_Remove_Linked_List_Elements {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        List<Integer> tmp = new ArrayList<Integer>();
        while (head != null) {
            if (head.next != null) {
                if (head.val == val) {
                    head.val = head.next.val;
                    head.next = head.next.next;
                } else {
                    tmp.add(head.val);
                    head.val = head.next.val;
                    head.next = head.next.next;
                }
            } else if (head.next == null) {
                if (head.val != val) {
                    tmp.add(head.val);
                }
                break;
            }
            
        }
        if (tmp.size() == 0) {
             return null;
        }
        ListNode result = new ListNode();
        result.val = tmp.get(tmp.size() - 1);
        for (int i = tmp.size() - 2; i>=0; i--) {
            ListNode resultTmp = new ListNode();
            resultTmp.val = tmp.get(i);
            resultTmp.next = result;
            result = resultTmp;
            
        }
        return result;
    }
}
