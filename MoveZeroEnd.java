/*Given an array of integers A, push all the zeroes in the array to the end of the array keeping the order of all 
the remaining elements same. More formally, if A[i] and A[j] are two non zero elements and A[i] is in the left A[j] 
in the original array then A[i] will be in the left of A[j] in the final answer as well.*/

/*Input 1:
    A = [1, 0, 3, 5, 0]
Output 1:
    [1, 3, 5, 0, 0]
*/

public class Solution {
    public int[] solve(int[] A) {
        int len = A.length;
        int flag = 0;
        int x =0;
        for(int i=0;i<len;i++){
           if(A[i]==0 && flag==0){
               flag=1;
               x=i;
           }
           if(A[i]!=0 && flag==1){
               int temp = A[i];
               A[i] = 0;
               A[x] = temp;
               x++;
           }
        }
        return A;
    }
}
