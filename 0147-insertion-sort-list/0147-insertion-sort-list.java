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
    static void insertionSort(ArrayList<Integer> arr){
        int n = arr.size();
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr.get(j-1) > arr.get(j)){
                int temp = arr.get(j);
                arr.set(j,arr.get(j-1));
                arr.set(j-1 , temp);
                j--;
            }
        }
    }
    public ListNode insertionSortList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> arr = new ArrayList<>();
        while(temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }

        insertionSort(arr);

        temp = head;
        int i=0;
        while(temp != null){
            temp.val = arr.get(i);
            temp = temp.next;
            i++;
        }

        return head;
    }
}