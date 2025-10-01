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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode temp = even;

        while(temp != null && temp.next != null){
            odd.next = odd.next.next;
            temp.next = temp.next.next;

            odd = odd.next;
            temp = temp.next;
        }
        odd.next = even;
        return head;
    }
}