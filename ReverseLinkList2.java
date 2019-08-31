/**
Reverse a linked list from position m to n. Do it in-place and in one-pass. For example: 
Given 1->2->3->4->5->NULL, m = 2 and n = 4, return 1->4->3->2->5->NULL.
 Note: Given m, n satisfy the following condition: 1 ≤ m ≤ n ≤ length of list. 
 Note 2: Usually the version often seen in the interviews is reversing the whole linked list which is obviously an easier
 version of this question
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode A, int B, int C) {
        ListNode start = A;
        ListNode prevS = null;
        ListNode next =null;
        ListNode curr = null;
        ListNode prev = null;
        int cnt =1;
        while(cnt<B){
            prevS =start;
            start=start.next;
            cnt++;
        }
        curr=start;
        prev =null;
        next=curr.next;
        while(curr.next!=null && cnt<C){
            prev=curr;
            curr=next;
            next=next.next;
            curr.next=prev;
            cnt++;
        }
        if(prevS!=null)
        prevS.next=curr;
        else
        A=curr;
        if(next!=null)
        start.next=next;
        else
        start.next=null;
        return A;
    }
}
