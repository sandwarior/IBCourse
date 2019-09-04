/**
Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. 
For example, Given 1->2->3->3->4->4->5, return 1->2->5. Given 1->1->1->2->3, return 2->3.
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
            while(curr.next!=null && curr.next.val==curr.val){
                flag=1;
                curr=curr.next;
            }
            if(flag==1){
            if(prev==null){
                A=curr.next;
                curr=curr.next;
                flag=0;
            }else{
                flag=0;
                prev.next=curr.next;
                curr= curr.next;
            }
            }else{
            prev=curr;
            curr=curr.next;
            }
        }
        return A;
    }
}
