/*Input 1:
    A = [   [1, 3],
            [-2, 2]  ]
    B = 1
Output 1:
    [ [-2, 2] ]*/

public class Solution {
    public int[][] solve(int[][] A, int B) {
        int len  = A.length;
        long max=0;
        long arr[][] = new long[len][2];
        for(int i=0;i<len;i++){
            arr[i][0]=((long)A[i][0]*(long)A[i][0])+((long)A[i][1]*(long)A[i][1]);
            arr[i][1]=i;
            if(arr[i][0]>max)
            max=arr[i][0];
        }
        Arrays.sort(arr, (a, b) -> Long.compare(a[0], b[0]));
        int result[][] = new int[B][2];
        for(int i=0;i<B;i++){
            result[i][0] = A[(int)arr[i][1]][0];
            result[i][1] = A[(int)arr[i][1]][1];
        }
        return result;
    }
}
