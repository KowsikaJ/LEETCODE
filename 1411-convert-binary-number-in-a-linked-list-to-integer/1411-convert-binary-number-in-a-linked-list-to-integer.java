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
    public int getDecimalValue(ListNode head) {
        ListNode curr=head;
        int c=-1;
        while(curr!=null){
            c++;
            curr=curr.next;

        }
        int val=0;
        while(head!=null){
            val+=head.val*Math.pow(2,c);
            c--;
            head=head.next;
        }
        return val;
    }
}