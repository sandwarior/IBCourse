/**
Given a singly linked list, determine if its a palindrome. Return 1 or 0 denoting if its a palindrome or not, respectively. Notes:
Expected solution is linear in time and constant in space.
For example,
List 1-->2-->1 is a palindrome.
List 1-->2-->3 is not a palindrome.
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public int lPalin(ListNode A) {
        ListNode head =new ListNode(A.val);
        ListNode node = null;
        ListNode curr = A.next;
        while(curr!=null){
            node = new ListNode(curr.val);
            node.next =head;
            head=node;
            curr=curr.next;
        }
        while(head!=null){
            if(head.val!=A.val)
            return 0;
            head=head.next;
            A=A.next;
        }
        return 1;
    }
}
