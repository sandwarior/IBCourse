/**
Given a linked list of integers. Find and return the middle element of the linked list. Note: If there are N nodes in the linked list and N is even then return the (N/2+1)th element. 
Input Format
Input 1:
    1->2->3->4->5
Output 1:
   3 

Input 2:
    A = 1->5->6->2->3->4
Output 2:
    2
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int solve(ListNode A) {
        ListNode slow = A;
        ListNode fast = A;
        
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast.next!=null)
        return slow.next.val;
        else
        return slow.val;
    }
}
