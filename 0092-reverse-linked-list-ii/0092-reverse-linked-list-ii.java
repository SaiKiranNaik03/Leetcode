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
    static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || left == right) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prevL = dummy;
        for (int i = 1; i < left; i++) {
            prevL = prevL.next;
        }

        ListNode nodeL = prevL.next;
        ListNode nodeR = nodeL;
        for (int i = left; i < right; i++) {
            nodeR = nodeR.next;
        }

        ListNode nextR = nodeR.next;
        nodeR.next = null;

        prevL.next = reverse(nodeL);

        while (prevL.next != null) {
            prevL = prevL.next;
        }

        prevL.next = nextR;

        return dummy.next;
    }

    
}