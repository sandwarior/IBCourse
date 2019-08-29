/*Given an array, 
find the nearest smaller element G[i] for every element A[i] in the array such that the element has an index smaller than i.
Input 1:
    A = [4, 5, 2, 10, 8]
Output 1:
    G = [-1, 4, -1, 2, 2]
Explaination 1:
    index 1: No element less than 4 in left of 4, G[1] = -1
    index 2: A[1] is only element less than A[2], G[2] = A[1]
    index 3: No element less than 2 in left of 2, G[3] = -1
    index 4: A[3] is nearest element which is less than A[4], G[4] = A[3]
    index 4: A[3] is nearest element which is less than A[5], G[5] = A[3]
*/

public class Solution {
    public int[] prevSmaller(int[] A) {
        int len = A.length;
        int min = 1000000001;
        int left[] = new int[len];
        int top = -1;
        int stack[] = new int[len];
        for(int i=0;i<len;i++){
             while(top>=0 && A[stack[top]]>=A[i]){
                 top--;
             }
            if(top==-1){
                left[i] = -1;
                stack[++top] = i;
            }else{
                left[i] = A[stack[top]];
                stack[++top] = i;
            }
        }
        return left;
    }
}
