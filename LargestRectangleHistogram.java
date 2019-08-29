/*Given an array of integers A of size N. A represents a histogram i.e A[i] denotes height of the ith histogram's bar.
Width of each bar is 1. Largest Rectangle in Histogram: 
Return the area of largest rectangle in the histogram.
For Example
Input 1:
    A = [2, 1, 5, 6, 2, 3]
Output 1:
    10*/


public class Solution {
    public int largestRectangleArea(int[] A) {
        int len = A.length;
        int min = 1000000001;
        int left[] = new int[len];
        int right[] = new int[len];
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
                left[i] = stack[top];
                stack[++top] = i;
            }
        }
        top = -1;
        for(int i=len-1;i>=0;i--){
             while(top>=0 && A[stack[top]]>=A[i]){
                 top--;
             }
            if(top==-1){
                right[i] = len;
                stack[++top] = i;
            }else{
                right[i] = stack[top];
                stack[++top] = i;
            }
        }
        int max = 0;
        for(int i=0;i<len;i++){
            int x = A[i]*(right[i]-left[i]-1);
            if(x>max)
            max=x;
        }
        
        return max;
    }
}
