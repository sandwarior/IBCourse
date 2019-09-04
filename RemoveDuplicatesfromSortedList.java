/**
Given a sorted linked list, delete all duplicates such that each element appear only once. 
For example, Given 1->1->2, return 1->2. Given 1->1->2->3->3, return 1->2->3.
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode A) {
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = A;
        int flag=0;
        while(curr!=null){
            prev=curr;
            while(curr.next!=null && curr.next.val==curr.val){
                flag=1;
                curr=curr.next;
            }
            if(flag==1){
                flag=0;
                prev.next=curr.next;
                curr= curr.next;
            }else{
            curr=curr.next;
            }
        }
        return A;
    }
}
