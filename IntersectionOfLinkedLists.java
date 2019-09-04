/**
Intersection of Linked Lists
Write a program to find the node at which the intersection of two singly linked lists begins. For example, the following two linked lists:
A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗
B:     b1 → b2 → b3
begin to intersect at node c1.
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode getIntersectionNode(ListNode a, ListNode b) {
	    ListNode first = a;
	    ListNode second = b;
	    int size1=0;
	    int size2=0;
	    int cnt=0;
	    while(first!=null){
	        size1++;
	        first=first.next;
	    }
	    while(second!=null){
	        size2++;
	        second=second.next;
	    }
	    first = a;
	    second = b;
	    if(size1<size2){
	        while(cnt<(size2-size1)){
	       cnt++;
	        second=second.next;
	        }
	    }else{
	        while(cnt<(size1-size2)){
	            cnt++;
	        first=first.next;
	        }
	    }
	    while(first!=second && first!=null && second!=null){
	        first=first.next;
	        second=second.next;
	    }
	    if(first==null ||second==null)
	    return null;
	    else
	    return first;
	}
}
