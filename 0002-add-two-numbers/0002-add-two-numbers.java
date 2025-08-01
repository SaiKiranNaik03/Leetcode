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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         // code here
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        
        ListNode res = new ListNode(-1);
        ListNode temp = res;
        int carry = 0;
        while(temp1 != null || temp2 != null){
            int s = carry;
            if(temp1 != null){
                s+=temp1.val;
                temp1 = temp1.next;
            }
            if(temp2 != null){
                s += temp2.val;
                temp2 = temp2.next;
            }
            ListNode newNode = new ListNode(s%10);
            carry = s/10;
            temp.next = newNode;
            temp=temp.next;
        }
        if(carry != 0){
            ListNode newNode = new ListNode(carry);
            temp.next = newNode;
        }
        return res.next;
    }
}