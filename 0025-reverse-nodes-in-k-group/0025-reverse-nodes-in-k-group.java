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
    static ListNode reverse(ListNode temp){
        ListNode prev = null;
        ListNode cur = temp;

        while(cur != null){
            ListNode front = cur.next;
            cur.next = prev;
            prev = cur;
            cur = front;
        }

        return prev;
    }
    static ListNode getKthNode(ListNode temp, int k){
        k--;
        while(temp!=null && k>0){
            temp = temp.next;
            k--;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null){

            ListNode KthNode = getKthNode(temp,k);

            if(KthNode == null){
                prev.next = temp;
                break;
            }
            
            ListNode front = KthNode.next;
            
            KthNode.next = null;

            reverse(temp);

            if(temp == head){
                head = KthNode;
            }else{
                prev.next = KthNode;
            }
            prev = temp;
            
            temp = front;
        }
        return head;
    }
}