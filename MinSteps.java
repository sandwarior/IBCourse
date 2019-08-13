/*You are in an infinite 2D grid where you can move in any of the 8 directions :
You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it. You start from the first point. Example :
Input : [(0, 0), (1, 1), (1, 2)]
Output : 2*/

public class Solution {
    public int coverPoints(int[] A, int[] B) {
        
        int len = A.length;
        int sum=0;
        for(int i=1;i<len;i++){
            sum+=Math.max(Math.abs(A[i]-A[i-1]),Math.abs(B[i]-B[i-1]));
        }
        return sum;
    }
}
