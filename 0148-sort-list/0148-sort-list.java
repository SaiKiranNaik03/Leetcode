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
    public static ListNode merge(ListNode l1, ListNode l2){
        ListNode result = new ListNode(-1);
        ListNode dum = result;
        
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                dum.next = l1;
                l1=l1.next;
            }else{
                dum.next = l2;
                l2 = l2.next;
            }
            dum = dum.next;
        }
        if(l1 != null){
            dum.next = l1;
        }else{
            dum.next = l2;
        }

        return result.next;
    }

    public static ListNode middle(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static ListNode divide(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = middle(head);
        ListNode right = mid.next;
        mid.next = null;
        ListNode left = head;

        left = divide(left);
        right = divide(right);

        return merge(left,right);
    }
    public ListNode sortList(ListNode head) {
        return divide(head);
    }
}