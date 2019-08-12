/*Given an unsorted integer array, find the first missing positive integer. 
Example: Given [1,2,0] return 3, [3,4,-1,1] return 2,  [-8, -7, -6] returns 1  
Your algorithm should run in O(n) time and use constant space.*/

public class Solution {
    public int firstMissingPositive(int[] A) {
        
        int len = A.length;
       // System.out.println(len);
        int temp;
        for(int i=0;i<len;i++){
            if((A[i]>0 && A[i]<len) && A[i]!=i+1 && A[A[i]-1]!=A[i]){
              //  System.out.println(i+" "+A[i]);
                temp = A[A[i]-1];
                A[A[i]-1] = A[i];
                A[i]=temp;
                i--;
            }
        }
        int i;
        for(i=0;i<len;i++)
        {
           // System.out.print(A[i]+" ");
            if(A[i]!=i+1)
            return i+1;
        }
        return i+1;
    }
}
