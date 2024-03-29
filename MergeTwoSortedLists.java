/**
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists, and should also be sorted. For example, given following linked lists :
  5 -> 8 -> 20 
  4 -> 11 -> 15
The merged list should be :
4 -> 5 -> 8 -> 11 -> 15 -> 20
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
        ListNode head = null;
        ListNode node = null;
        ListNode tail = null;
        while(A!=null && B!=null){
            if(A.val<B.val){
                node = A;
                A=A.next;
            }else{
                node = B;
                B = B.next;
            }
            if(head==null){
                head=node;
                tail=node;
            }
            else{
                tail.next=node;
                tail=tail.next;
            }
        }
        while(A!=null){
            node = A;
            A=A.next;
            tail.next=node;
            tail=tail.next;
        }
        while(B!=null){
           node = B;
            B = B.next;
            tail.next=node;
            tail=tail.next;
        }
        return head;
    }
}
