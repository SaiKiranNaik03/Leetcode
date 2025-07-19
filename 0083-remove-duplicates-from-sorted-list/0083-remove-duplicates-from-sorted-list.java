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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp != null){
            ListNode nextN = temp.next;
            while(nextN != null && temp.val == nextN.val){
                nextN = nextN.next;
            }
            temp.next = nextN;
            temp = temp.next;
        }
        return head;
    }
}