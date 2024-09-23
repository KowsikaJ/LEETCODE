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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        int size = 0;
        
        // Calculate the size of the list
        while (temp != null) {
            size++;
            temp = temp.next;
        }

        temp = head;
        int[] nums = new int[size];
        int idx = 0;

        while (temp != null) {
            nums[idx] = temp.val;
            temp = temp.next;
            idx++;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[nums.length - 1 - i]) {
                return false;
            }
        }
        
        return true;
        
    }
}