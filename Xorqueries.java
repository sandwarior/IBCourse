/*You are given an array (containing only 0 and 1) as element of N length. Given L and R, you need to determine value of XOR of all elements from L to R (both inclusive) and number of unset bits (0's) in the given range of the array.  Input
First argument contains the array of size N containing 0 and 1 only (1<=N<=100000). 

Second argument contains a 2D array with Q rows and 2 columns, each row represent a query with 2 columns representing L and R. 

(1<=Q<=100000), (1<=L<=R<=N).
Output
Return an 2D array of Q rows and 2 columns i.e the xor value and number of unset bits in that range respectively for each query.
Examples Input
1 0 0 0 1
2 4
1 5 
3 5
Output
0 3
0 3
1 2*/

public class Solution {
    public int[][] solve(int[] A, int[][] B) {
        
        int len = A.length;
        int xor[] = new int[len+1];
        int zero[] = new int[len+1];
        
        
        for(int i=1;i<=len;i++){
            if(A[i-1]==0)
            zero[i] = zero[i-1]+1;
            else
            zero[i] = zero[i-1];
            xor[i] = xor[i-1]^A[i-1];
        }
       /* for(int i=0;i<=len;i++)
        System.out.print(xor[i]+" ");
        for(int i=0;i<=len;i++)
        System.out.print(zero[i]+" ");*/
        int n = B.length;
        int arr[][] = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = xor[B[i][0]-1]^xor[B[i][1]];
            arr[i][1] =zero[B[i][1]]-zero[B[i][0]-1];
        }
        return arr;
    }
}
