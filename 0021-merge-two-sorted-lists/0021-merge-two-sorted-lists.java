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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return list1;
        }
        if(list1 == null && list2 != null){
            return list2;
        }
        if(list1 != null && list2 == null){
            return list1;
        }
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode dum = new ListNode(-1);
        ListNode dummi = dum;
        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                dummi.next = temp1;
                temp1=temp1.next;
                dummi = dummi.next;
            }else{
                dummi.next = temp2;
                temp2 = temp2.next;
                dummi = dummi.next;
            }
        }
        if(temp1 != null){
            dummi.next = temp1;
        }
        if(temp2 != null){
            dummi.next = temp2;
        }
        return dum.next;
    }
}