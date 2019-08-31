/**
Given a linked list, remove the nth node from the end of list and return its head. For example, Given linked list: 1->2->3->4->5, and n = 2. After removing the second node from the end, the linked list becomes 1->2->3->5.
 Note:
If n is greater than the size of the list, remove the first node of the list.
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode fast = A;
        ListNode slow = A;
        ListNode prev = A;
        int cnt=1;
        while(fast!=null && cnt<B){
            fast=fast.next;
            cnt++;
        }
        if(fast!=null){
        while(fast.next!=null){
            fast=fast.next;
            prev =slow;
            slow=slow.next;
        }
        }
        if(prev==A){
            return prev.next;
        }else
        {
            prev.next=slow.next;
            return A;
        }
    }
}
