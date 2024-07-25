package Easy;

import java.util.ArrayList;
import java.util.List;

/*
 * Given the head of a singly linked list, return the middle node of the linked list.
 * 
 * If there are two middle nodes, return the second middle node.
 * 
 *  
 * 
 * Example 1:
 * 
 * 
 * Input: head = [1,2,3,4,5]
 * Output: [3,4,5]
 * Explanation: The middle node of the list is node 3.
 * Example 2:
 * 
 * 
 * Input: head = [1,2,3,4,5,6]
 * Output: [4,5,6]
 * Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
 *  
 * 
 * Constraints:
 * 
 * The number of nodes in the list is in the range [1, 100].
 * 1 <= Node.val <= 100
 */
public class LC0876_Middle_Of_The_Linked_List {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode middleNode(ListNode head) {
        List<ListNode> nodes = new ArrayList<ListNode>();
        int index = 1;
        nodes.add(head);
        while(head.next != null){
            index++;
            nodes.add(head.next);
            head = head.next;
        }
        return nodes.get(index/2);
    
    }
}
