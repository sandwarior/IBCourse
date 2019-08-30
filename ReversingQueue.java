/*Given an array of integers A and an integer B. 
we need to reverse the order of the first B elements of the array, leaving the other elements in the same relative order.
1 <= B <= length of the array <= 200000
1 <= A[i] <= 100000
For Example
Input 1:
    A = [1, 2, 3, 4, 5]
    B = 3
Output 1:
    [3, 2, 1, 4, 5]

Input 2:
    A = [5, 17, 100, 11]
    B = 2
Output 2:
    [17, 5, 100, 11]*/
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int[] queue = new int[200001];
        int front =0;
        int rear = 0;
        for(int i=0;i<B;i++){
            queue[rear++]=A.get(i);
        }
        for(int i=B-1;i>=0;i--){
            A.set(i,queue[front++]);
        }
        return A;
    }
}
