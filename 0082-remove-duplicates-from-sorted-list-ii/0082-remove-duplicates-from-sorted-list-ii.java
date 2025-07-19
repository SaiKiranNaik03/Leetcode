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
        ListNode dum = new ListNode(-1);
        dum.next = head;
        ListNode prev = dum;
        while(temp != null){
            ListNode nextN = temp.next;
            if(nextN != null && temp.val == nextN.val){
                while(nextN != null && temp.val == nextN.val  ){
                    nextN = nextN.next;
                }
                prev.next = nextN;
            
            }else{
                prev = prev.next;
            }
            temp = nextN;
        }
        return dum.next;
    }
}