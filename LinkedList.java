/*Design and implement a Linked List data structure. A node in a linked list should have the following attributes - an integer value and a pointer to the next node. It should support the following operations:
insert_node(position, value) - To insert the input value at the given position in the linked list.
delete_node(position) - Delete the value at the given position from the linked list.
print_ll() - Print the entire linked list, such that each element is followed by a single space.

Note: 1 <= position <= n where, n is the size of the linked-list.
If an input position does not satisfy the constraint, no action is required.

 Sample Input: 3
i 1 23
i 2 24
p
d 1
p

 Sample Output: 23 24 
24*/

import java.lang.*;
import java.util.*;

public class Main {
    int value;
    Main next;
    static Main head=null;
    static int size=0;
    Main(int value){
        this.value =value;
        next=null;
    }
    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        if(position>=1 && position<=size+1){
        if(head==null){
            head = new Main(value);
        }else{
            Main node = head;
            int cnt=1;
            while(cnt<position-1){
                node=node.next;
                cnt++;
            }
            if(position==1){
            node = new Main(value);
            node.next=head;
            head=node;
            }else{
            Main next=node.next;
            node.next = new Main(value);
            node=node.next;
            node.next=next;
            }
        }
        size++;
        }
    }

    public static void delete_node(int position) {
        // @params position, integer
        if(position>=1 && position<=size){
        Main node = head;
        Main prev=null;
            int cnt=1;
            while(cnt<position){
                prev=node;
                node=node.next;
                cnt++;
            }
             //System.out.print(prev.value+" "+node.value+" "+cnt+" ");
            if(prev==null)
            head=head.next;
            else
            prev.next = node.next;
            size--;
        }
    }

    public static void print_ll() {
        // Output each element followed by a space
        Main node = head;
        while(node!=null){
            System.out.print(node.value+" ");
            node=node.next;
        }
    }
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cases=0, position=0, value=0;
        cases = s.nextInt();
        for(int i=0; i<cases; i++) {
            char ch = s.next().charAt(0);
            switch(ch) {
                case 'i':
                    position = s.nextInt();
                    value = s.nextInt();
                    insert_node(position, value);
                    break;
                case 'd':
                    position = s.nextInt();
                    delete_node(position);
                    break;
                case 'p':
                    print_ll();
                    System.out.println();
                    break;
                default:
                    System.out.println("Check Your Input");
            }
        }
    }
}
