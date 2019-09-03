/*Given a linked list where every node represents a linked list and contains two pointers of its type:
Pointer to next node in the main list (right pointer)
Pointer to a linked list where this node is head (down pointer). All linked lists are sorted.
You are asked to flatten the linked list into a single list. Use down pointer to link nodes of the flattened list. The flattened linked list should also be sorted. 
1 <= Total nodes in the list <= 100000
1 <= Value of node <= 10^9
For Example
Input 1:
       3 -> 4 -> 20 -> 20 ->30
       |    |    |     |    |
       7    11   22    20   31
       |               |    |
       7               28   39
       |               |
       8               39

Output 1:
3 -> 4 -> 7 -> 7 -> 8 -> 11 -> 20 -> 20 -> 20 -> 22 -> 28 -> 30 -> 31 -> 39 -> 39 */

import java.lang.*;
import java.util.*;
import java.io.*;

public class Main {

class ListNode {
    int val;
    ListNode right, down;
    ListNode(int x) {
        val = x;
        right = down = null;
    }
}
/*
class ListNode {
    int val;
    ListNode right, down;
    ListNode(int x) {
        val = x;
        right = down = null;
    }
}
*/
ListNode flatten(ListNode root) {
    ListNode head = merge(root);
    return head;
}
ListNode merge(ListNode root){
     ListNode flat =null;
    if(root.right==null){
        return root;
    }else{
      flat =  merge(root.right);
    }
    ListNode head = null;
        ListNode tail = null;
        while(flat!=null && root!=null){
            ListNode node=null;
            if(flat.val<root.val){
                node = new ListNode(flat.val);
                flat=flat.down;
            }else{
             node = new ListNode(root.val);
            root=root.down;
            }
            if(head==null){
            head=node;
            tail=node;
            }else{
            tail.down=node;
            tail=tail.down;
            }
        }
        while(flat!=null){
         ListNode node = new ListNode(flat.val);
                flat=flat.down;
                tail.down=node;
            tail=tail.down;
        }
        while(root!=null){
            ListNode node = new ListNode(root.val);
            root=root.down;
            tail.down=node;
            tail=tail.down;
        }
        return head;
}
BufferedReader br;
    PrintWriter out;
    
    void solve() {
        int t = ni();
        while(t-- > 0) {
            int n = ni();
            ListNode head = null;
            ListNode pre = null;
            for(int i = 0; i < n; i++) {
                int m = ni();
                ListNode p1 = null;
                while(m-- > 0) {
                    int x = ni();
                    ListNode temp = new ListNode(x);
                    if(head == null)    head = temp;
                    if(p1 == null) {
                        if(pre != null) pre.right = temp;
                        pre = temp;
                    } else {
                        p1.down = temp;
                    }
                    p1 = temp;
                }
            }
            ListNode flat = flatten(head);
            ListNode temp = flat;
            boolean first = true;
            while(temp != null) {
                if( !first )    out.print("-> ");
                out.print(temp.val +" ");
                temp = temp.down;
                first = false;
            }
            out.println();
        }
    }

    int ni() {
        return Integer.parseInt(ns());
    }
    
    StringTokenizer ip;
    
    String ns() {
        if(ip == null || !ip.hasMoreTokens()) {
            try {
                ip = new StringTokenizer(br.readLine());
            } catch(IOException e) {
                throw new InputMismatchException();
            }
        }
        return ip.nextToken();
    }
    
    void run() {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.flush();
    }
    
    public static void main(String[] args) {
        new Main().run();
    }

}
