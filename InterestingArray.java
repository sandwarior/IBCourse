/*You have an array A[] with N elements. We have 2 types of operation available on this array :
We can split a element B into 2 elements C and D such that B = C + D.
We can merge 2 elements P and Q as one element R such that R = P^Q i.e XOR of P and Q.
You have to determine whether it is possible to make array A[] containing only 1 element 0 after several splits and/or merge? 
Return "Yes" if it is possible otherwise return "No".
Examples Input
9 17
Output
Yes*/

public class Solution {
    public String solve(int[] A) {
        int len = A.length;
        int cnt=0;
        for(int i=0;i<len;i++){
            if(A[i]%2==1)
            cnt++;
        }
        if(cnt%2==1)
        return "No";
        else
        return "Yes";
    }
}
