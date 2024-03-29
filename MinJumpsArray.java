/*Given an array of non-negative integers, A, of length N, you are initially positioned at the first index of the array. Each element in the array represents your maximum jump length at that position. Return the minimum number of jumps required to reach the last index. If it is not possible to reach the last index, return -1. Input Format:
The first and the only argument contains an integer array, A.
Output Format:
Return an integer, representing the answer as described in the problem statement.
Constraints:
1 <= N <= 1e6
0 <= A[i] <= 50000
Examples:
Input 1:
    A = [2, 1, 1]

Output 1:
    1

Explanation 1:
    The shortest way to reach index 2 is
        Index 0 -> Index 2
    that requires only 1 jump.

Input 2:
    A = [2,3,1,1,4]

Output 2:
    2

Explanation 2:
    The shortest way to reach index 4 is
        Index 0 -> Index 1 -> Index 4
    that requires 2 jumps.
*/


public class Solution {
    public int jump(ArrayList<Integer> A) {
        int len = A.size();
        int arr[] = new int[len];
        arr[0]=0;
        int max=0;
        int i=1;
        max= A.get(0);
        int newMax=0;
        int maxp=0;
        if(len==1)
        return 0;
        if(max==0)
        return -1;
        while(true){
            if(max>=len-1){
            arr[len-1]=arr[maxp]+1;
            break;
            }
            else
            arr[max] = arr[maxp]+1;
            maxp=max;
          // System.out.println(max+" "+arr[max]+" "+i);
            while(i<=maxp && i<len){
                int x = A.get(i);
                newMax = x+i;
                if(newMax>max)
                    max=newMax;
                    i++;
            }
        }
        //for(int j=0;j<len;j++)
        //System.out.print(arr[j]+" ");
        if(arr[len-1]==0)
        return -1;
        return arr[len-1];
    }
}
