/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode travNode = head;
        if (head == null) {
            return head;
        }
        while (travNode != null && travNode.next != null) {
            int temp = travNode.val;
            travNode.val = travNode.next.val;
            travNode.next.val = temp;
            travNode = travNode.next.next;
        }
        return head;
    }
}
