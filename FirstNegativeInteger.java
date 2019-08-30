/*Given an array of integers A of size N and an integer B.
Find the first negative integer for each and every window(contiguous subarray) of size B.
If a window does not contain a negative integer, then return 0 for that window.
1 <= length of the array <= 200000
-10^9 <= A[i] <= 10^9 
For Example
Input 1:
    A = [-1, 2, 3, -4, 5]
    B = 2
Output 1:
    [-1, 0, -4, -4] 

Input 2:
    A = [-8, 2, 3, -6, 10]
    B = 2
Output 2:
    [-8, 0, -6, -6]*/

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int len = A.size();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int[] queue = new int[200001];
        int front = -1;
        int rear = -1;
        for(int i=0;i<B;i++){
            if(A.get(i)<0){
                if(front==-1)
                front++;
                rear++;
                queue[rear]=A.get(i);
            }
        }
        if(front==-1)
        arr.add(0);
        else
        arr.add(queue[front]);
        for(int i=B;i<len;i++){
            if(A.get(i)<0){
                if(front==-1)
                front++;
                rear++;
                queue[rear]=A.get(i);
            }
            if(A.get(i-B)<0){
                front++;
                if(front>rear){
                front=-1;
                rear=-1;
                }
            }
            if(front==-1)
                arr.add(0);
            else
                arr.add(queue[front]);
        }
        return arr;
    }
}
