package Easy;

import java.util.ArrayList;

public class LC0234_Palindrome_Linked_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> listNode = new ArrayList<Integer>();
		while (head != null) {
			listNode.add(head.val);
			head = head.next;
		}
		for (int i = 0; i < listNode.size()/2; i++) {
			if (listNode.get(i) != listNode.get(listNode.size()-1-i)) {
				return false;
			}
		}
        return true;
    }
}
