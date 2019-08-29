/**
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum;
        int carry = 0;
        sum = (l1.val+l2.val)%10;
        ListNode head = new ListNode(sum);
        head.next = null;
        ListNode node = head;
        carry = (l1.val+l2.val)/10;
        l1=l1.next;
        l2=l2.next;
        while(l1!=null && l2!=null){
            sum = (l1.val+l2.val+carry)%10;
            node.next = new ListNode(sum);
            node=node.next;
            node.next=null;
            carry =(l1.val+l2.val+carry)/10;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            sum = (l1.val+carry)%10;
            node.next = new ListNode(sum);
            node=node.next;
            node.next=null;
            carry = (l1.val+carry)/10;
            l1=l1.next;
        }
        while(l2!=null){
            sum = (l2.val+carry)%10;
            node.next = new ListNode(sum);
            node=node.next;
            node.next=null;
            carry = (l2.val+carry)/10;
            l2=l2.next;
        }
        if(carry!=0){
            node.next = new ListNode(carry);
            node=node.next;
            node.next=null;
        }
        return head;
    }
}
