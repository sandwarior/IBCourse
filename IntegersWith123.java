/*Given an integer A. Find and Return first positive A integers in ascending order containing only digits 1,2 and 3. NOTE: all the A integers will fit in 32 bit integer. 
Input Format
1 <= A <= 29500
For Example
Input 1:
    A = 3
Output 1:
    [1, 2, 3]

Input 2:
    A = 7
Output 2:
    [1, 2, 3, 11, 12, 13, 21]*/

public class Solution {
    public ArrayList<Integer> solve(int A) {
        int[] queue = new int[29503];
        int front = 0;
        int rear = 2;
        queue[0]=1;
        queue[1]=2;
        queue[2]=3;
        int cnt=3;
        while(cnt<=A){
            queue[++rear] = queue[front]*10+1;
            queue[++rear] = queue[front]*10+2;
            queue[++rear] = queue[front]*10+3;
            cnt+=3;
            front++;
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<A;i++){
            arr.add(queue[i]);
        }
        return arr;
    }
}
